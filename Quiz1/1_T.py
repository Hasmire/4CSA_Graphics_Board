from PIL import Image, ImageDraw, ImageFont, ImageOps

image = Image.new("RGB", (600,650), color = (255,255,255))

draw = ImageDraw.Draw(image)

draw.line([(100,250), (150, 250)], fill="black", width=5)

draw.line([(150, 250), (150, 200)], fill="black", width=5)

draw.line([(150, 200), (200, 200)], fill="black", width=5)

draw.line([(200, 200), (200, 500)], fill="black", width=5)

draw.line([(200, 500), (400, 500)], fill="black", width=5)

draw.line([(400, 500), (400, 200)], fill="black", width=5)

draw.line([(400, 200), (450, 200)], fill="black", width=5)

draw.line([(450, 200), (450, 250)], fill="black", width=5)

draw.line([(450, 250), (500, 250)], fill="black", width=5)

draw.line([(500, 250), (500, 150)], fill="black", width=5)

draw.line([(500, 150), (450, 100)], fill="black", width=5)

draw.line([(450, 100), (150, 100)], fill="black", width=5)

draw.line([(150, 100), (100, 150)], fill="black", width=5)

draw.line([(100, 150), (100, 250)], fill="black", width=5)

image.show()
image.save("Quiz1/1_T.png")