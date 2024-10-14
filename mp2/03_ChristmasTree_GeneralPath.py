import matplotlib.pyplot as plt
from matplotlib.path import Path
from matplotlib.patches import PathPatch

# Create the Star
s_vertices = [
    (300, 100),  # A
    (280, 80),  # B
    (300, 60),  # C
    (320, 80),  # D
    (300, 100),  # A
]

s_codes = [
    Path.MOVETO,  # A
    Path.LINETO,  # B
    Path.LINETO,  # C
    Path.LINETO,  # D
    Path.CLOSEPOLY,  # A
]

s_path = Path(s_vertices, s_codes)
s_path_patch = PathPatch(s_path, facecolor="yellow", edgecolor="black", lw=2)

t_vertices = [
    (300, 100),  # A
    (250, 250),  # B
    (270, 250),  # C
    (200, 400),  # D
    (220, 400),  # E
    (150, 550),  # F
    (450, 550),  # G
    (380, 400),  # H
    (400, 400),  # I
    (330, 250),  # J
    (350, 250),  # K
    (300, 100),  # A
]

t_codes = [
    Path.MOVETO,  # A
    Path.LINETO,  # B
    Path.LINETO,  # C
    Path.LINETO,  # D
    Path.LINETO,  # E
    Path.LINETO,  # F
    Path.LINETO,  # G
    Path.LINETO,  # H
    Path.LINETO,  # I
    Path.LINETO,  # J
    Path.LINETO,  # K
    Path.CLOSEPOLY,  # A
]

t_path = Path(t_vertices, t_codes)
t_path_patch = PathPatch(t_path, facecolor="green", edgecolor="black", lw=2)

b_vertices = [
    (285, 550),  # A
    (285, 580),  # B
    (315, 580),  # C
    (315, 550),  # D
    (285, 550),  # A
]

b_codes = [
    Path.MOVETO,  # A
    Path.LINETO,  # B
    Path.LINETO,  # C
    Path.LINETO,  # D
    Path.CLOSEPOLY,  # A
]

b_path = Path(b_vertices, b_codes)
b_path_patch = PathPatch(b_path, facecolor="brown", edgecolor="black", lw=2)

# Plot the image
fig, ax = plt.subplots()
ax.add_patch(s_path_patch)
ax.add_patch(t_path_patch)
ax.add_patch(b_path_patch)
ax.set_xlim(0, 600)
ax.set_ylim(0, 650)
ax.set_aspect(1)
plt.gca().invert_yaxis()
# plt.show()
plt.savefig("mp2/03_ChristmasTree_GeneralPath.png")
