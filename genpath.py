# import the required libraries
import matplotlib.pyplot as plt
from matplotlib import patches
from matplotlib import path as mpath

# Declare the vertices and the codes
vertices = [
    (50, 50),
    (50, 200),
    (150, 500),
    (250, 200),
    (350, 100),
    (150, 150),
    (100, 100),
    (50, 50),
]
codes = [
    mpath.Path.MOVETO,
    mpath.Path.LINETO,
    mpath.Path.CURVE3,
    mpath.Path.CURVE3,
    mpath.Path.CURVE4,
    mpath.Path.CURVE4,
    mpath.Path.CURVE4,
    mpath.Path.CLOSEPOLY,
]

# Create the path object
path_obj = mpath.Path(vertices, codes)

# Create the patch object
patch_obj = patches.PathPatch(path_obj, facecolor="red", edgecolor="green", lw=2)

# Plot the image
fig, ax = plt.subplots()
ax.add_patch(patch_obj)
ax.set_xlim(0, 500)
ax.set_ylim(0, 500)
plt.show()

# Car
vertices_car = [
    (60, 120),
    (80, 120),
    (90, 140),
    (100, 120),
    (160, 120),
    (170, 140),
    (180, 120),
    (200, 120),
    (195, 100),
    (200, 80),
    (160, 80),
    (110, 80),
    (90, 100),
    (60, 100),
    (60, 120),
]

codes_car = [
    mpath.Path.MOVETO,
    mpath.Path.LINETO,
    mpath.Path.CURVE3,
    mpath.Path.CURVE3,
    mpath.Path.LINETO,
    mpath.Path.CURVE3,
    mpath.Path.CURVE3,
    mpath.Path.LINETO,
    mpath.Path.CURVE4,
    mpath.Path.CURVE4,
    mpath.Path.CURVE4,
    mpath.Path.LINETO,
    mpath.Path.LINETO,
    mpath.Path.LINETO,
    mpath.Path.CLOSEPOLY,
]

path_car = mpath.Path(vertices_car, codes_car)
patch_car = patches.PathPatch(path_car, facecolor="blue", edgecolor="black", lw=2)

fig, ax = plt.subplots()
ax.add_patch(patch_car)
ax.set_xlim(0, 500)
ax.set_ylim(0, 500)
plt.show()
