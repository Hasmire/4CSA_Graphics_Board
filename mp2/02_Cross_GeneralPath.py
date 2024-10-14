import matplotlib.pyplot as plt
from matplotlib.path import Path
from matplotlib.patches import PathPatch

# Define the vertices and codes for the Path
vertices = [
    (250, 280),  # A
    (250, 180),  # B
    (290, 140),  # Control point for top curve
    (330, 180),  # C (end top curve)
    (330, 280),  # D
    (430, 280),  # E
    (470, 320),  # Control point for right curve
    (430, 360),  # F (end right curve)
    (330, 360),  # G
    (330, 460),  # H
    (290, 500),  # Control point for bottom curve
    (250, 460),  # I (end bottom curve)
    (250, 360),  # J
    (150, 360),  # K
    (110, 320),  # Control point for left curve
    (150, 280),  # L (end left curve)
    (250, 280),  # A (close path)
]

codes = [
    Path.MOVETO,  # A
    Path.LINETO,  # B
    Path.CURVE3,  # Control point for top curve
    Path.CURVE3,  # C (end top curve)
    Path.LINETO,  # D
    Path.LINETO,  # E
    Path.CURVE3,  # Control point for right curve
    Path.CURVE3,  # F (end right curve)
    Path.LINETO,  # G
    Path.LINETO,  # H
    Path.CURVE3,  # Control point for bottom curve
    Path.CURVE3,  # I (end bottom curve)
    Path.LINETO,  # J
    Path.LINETO,  # K
    Path.CURVE3,  # Control point for left curve
    Path.CURVE3,  # L (end left curve)
    Path.CLOSEPOLY,  # Close path
]

# Create the Path object
path = Path(vertices, codes)

# Create the PathPatch object
path_patch = PathPatch(path, facecolor="none", edgecolor="black", lw=2)

# Plot the image
fig, ax = plt.subplots()
ax.add_patch(path_patch)
ax.set_xlim(0, 600)
ax.set_ylim(0, 650)
ax.set_aspect(1)
plt.gca().invert_yaxis()
# plt.show()
plt.savefig("mp2/02_Cross_GeneralPath.png")
