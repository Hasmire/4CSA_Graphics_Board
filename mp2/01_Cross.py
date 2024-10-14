# Import the required libraries
from PIL import Image, ImageDraw, ImageFont

# Create the screen
image = Image.new("RGB", (600, 650), color=(255, 255, 255))

# Initial Image Generation
draw = ImageDraw.Draw(image)

# Top Lines
# Line AB
draw.line([(250, 280), (250, 180)], fill="black", width=5)
# Line BC
draw.line([(330, 180), (330, 280)], fill="black", width=5)

# Right Lines
# Line CD
draw.line([(330, 280), (430, 280)], fill="black", width=5)
# Line DE
draw.line([(430, 360), (330, 360)], fill="black", width=5)

# Bottom Lines
# Line EF
draw.line([(330, 360), (330, 460)], fill="black", width=5)
# Line FG
draw.line([(250, 460), (250, 360)], fill="black", width=5)

# Left Lines
# Line GH
draw.line([(250, 360), (150, 360)], fill="black", width=5)
# Line HA
draw.line([(150, 280), (250, 280)], fill="black", width=5)

# QuadCurve Points

# Top QuadCurve
t0 = (250, 180)
t1 = (290, 140)
t2 = (330, 180)

# Right QuadCurve
r0 = (430, 280)
r1 = (470, 320)
r2 = (430, 360)

# Bottom QuadCurve
b0 = (330, 460)
b1 = (290, 500)
b2 = (250, 460)

# Left QuadCurve
l0 = (150, 360)
l1 = (110, 320)
l2 = (150, 280)


def quadratic_bezier(p0, p1, p2, t):
    return (
        (1 - t) ** 2 * p0[0] + 2 * (1 - t) * t * p1[0] + t**2 * p2[0],
        (1 - t) ** 2 * p0[1] + 2 * (1 - t) * t * p1[1] + t**2 * p2[1],
    )


# Draw the QuadCurve
top = [quadratic_bezier(t0, t1, t2, t / 100) for t in range(101)]
right = [quadratic_bezier(r0, r1, r2, t / 100) for t in range(101)]
bottom = [quadratic_bezier(b0, b1, b2, t / 100) for t in range(101)]
left = [quadratic_bezier(l0, l1, l2, t / 100) for t in range(101)]

draw.line(top, fill="black", width=5)
draw.line(right, fill="black", width=5)
draw.line(bottom, fill="black", width=5)
draw.line(left, fill="black", width=5)

# Display the image
image.show()
image.save("mp2/01_Cross.png")
