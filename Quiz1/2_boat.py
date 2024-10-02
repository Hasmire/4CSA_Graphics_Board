from PIL import Image, ImageDraw, ImageFont, ImageOps

image = Image.new("RGB", (600,650), color = (255,255,255))

draw = ImageDraw.Draw(image)

draw.line([(100,350), (150, 450)], fill="black", width=1)
draw.line([(150, 450), (450, 450)], fill="black", width=1)
draw.line([(450,450), (500, 350)], fill="black", width=1)
draw.line([(500, 350), (305, 350)], fill="black", width=1)
draw.line([(305, 350), (290, 350)], fill="black", width=1)
draw.line([(290, 350), (290, 150)], fill="black", width=1)
draw.line([(290, 150), (300, 150)], fill="black", width=1)
draw.line([(300, 150), (300, 200)], fill="black", width=1)
draw.line([(300, 200), (400, 200)], fill="black", width=1)
draw.line([(300, 200), (300, 350)], fill="black", width=1)
draw.line([(400, 200), (300, 150)], fill="black", width=1)
draw.line([(290, 350), (100, 350)], fill="black", width=1)

image.show()
image.save("Quiz1/2_Boat.png")