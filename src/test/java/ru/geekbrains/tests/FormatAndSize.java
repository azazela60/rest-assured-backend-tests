package ru.geekbrains.tests;

public enum FormatAndSize {
    JPG("src/test/resources/Malamut.jpeg"),

    GIF("src/test/resources/bugs-bunny-10.gif"),

    PNG("src/test/resources/BMP.png"),

    TIFF("src/test/resources/CCITT_1.TIF"),

    TXT("src/test/resources/Plain Text.txt"),

    MP4_IMAGE("src/test/resources/MP4.jpg"),

    SMALL("src/test/resources/1x1_#e60ee4ff.png"),

    MEDIUM("src/test/resources/10000px.jpg"),

    HD("src/test/resources/10000px.jpg"),

    MIDDLE("src/test/resources/10000px.jpg"),

    BIG("src/test/resources/Malamut.jpeg"),

    MAX_SIZE("src/test/resources/10MB.jpg"),

    OVERSIZE("src/test/resources/10MB.jpg");


        private final String title;

        FormatAndSize(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }
        }





