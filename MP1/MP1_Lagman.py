from PIL import Image, ImageDraw, ImageFont
import math

# Create a blank image with a light gray background
width, height = 600, 600
image = Image.new("RGB", (width, height), color="lightgray")
draw = ImageDraw.Draw(image)

# Line (BLACK)
draw.line([(50, 475), (500, 125)], fill="black", width=5)
draw.line([(500, 125), (300, 300)], fill="black", width=5)
draw.line([(300, 300), (450, 500)], fill="black", width=5)
draw.line([(450, 500), (200, 375)], fill="black", width=5)
draw.line([(200, 375), (50, 475)], fill="black", width=5)

# Quadratic Curve (GREEN)
p0, p1, p2 = (175, 500), (200, 300), (400, 550)
quadratic_curve_points = [
    (
        int((1-t)**2 * p0[0] + 2 * (1-t) * t * p1[0] + t**2 * p2[0]),
        int((1-t)**2 * p0[1] + 2 * (1-t) * t * p1[1] + t**2 * p2[1])
    )
    for t in [i/100 for i in range(101)]
]
draw.line(quadratic_curve_points, fill="green", width=5)

# Cubic Bezier Curve (BLUE)
p0, p1, p2, p3 = (375, 300), (450, 550), (550, 450), (575, 350)

cubic_curve_points = [
    (
        int((1-t)**3 * p0[0] + 3 * (1-t)**2 * t * p1[0] + 3 * (1-t) * t**2 * p2[0] + t**3 * p3[0]),
        int((1-t)**3 * p0[1] + 3 * (1-t)**2 * t * p1[1] + 3 * (1-t) * t**2 * p2[1] + t**3 * p3[1])
    )
    for t in [i/100 for i in range(101)]
]
draw.line(cubic_curve_points, fill="blue", width=5)

# Rectangle (RED)
draw.rectangle([(100, 100), (250, 300)], outline="red", width=5)

# Ellipse (YELLOW)
centerX, centerY = 100, 90
horizontalRadius = int(math.sqrt(400))
verticalRadius = int(math.sqrt(900))
draw.ellipse(
    [(centerX - horizontalRadius, centerY - verticalRadius),
     (centerX + horizontalRadius, centerY + verticalRadius)],
    outline="yellow", width=5
)

# Arc (ORANGE)
draw.pieslice([(300, 50), (400, 125)], start=275, end=350, outline="orange", width=5)

# Labels (BLACK)
font = ImageFont.load_default()
draw.text((20, 20), "JR Gregg Victor M. Lagman", fill="black", font=font)
draw.text((200, 20), "4CSA", fill="black", font=font)
draw.text((460, 520), "Line", fill="black", font=font)
draw.text((230, 470), "QuadCurve", fill="black", font=font)
draw.text((450, 400), "CubicCurve", fill="black", font=font)
draw.text((140, 320), "Rectangle", fill="black", font=font)
draw.text((40, 80), "Ellipse", fill="black", font=font)
draw.text((340, 90), "Arc", fill="black", font=font)

# Save the image
image.save("MP1/MP1_4CSA_Lagman_Python.png")
image.show()
