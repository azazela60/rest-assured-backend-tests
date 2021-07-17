package ru.geekbrains.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.notNullValue;

public class PositivTest extends BaseTest {

        static String encodedFile;
        String uploadedImageId;



        @Test
        void uploadMiddleImageTest() {
            uploadedImageId = given()
                    .headers("Authorization", token)
                    .multiPart("image", new File(FormatAndSize.MIDDLE.getTitle()))
                    .expect()
                    .statusCode(200)
                    .body("success", is(true))
                    .body("data.account_url",equalTo(username))
                    .body("data.account_id",equalTo(145270851))
                    .when()
                    .post("https://api.imgur.com/3/upload")
                    .prettyPeek()
                    .then()
                    .extract()
                    .response()
                    .jsonPath()
                    .getString("data.deletehash");
        }

        @Test
        void uploadBigImageTest() {
            uploadedImageId = given()
                    .headers("Authorization", token)
                    .multiPart("image", new File(FormatAndSize.BIG.getTitle()))
                    .expect()
                    .statusCode(200)
                    .body("success", is(true))
                    .body("data.account_url",equalTo(username))
                    .body("data.account_id",equalTo(145270851))
                    .when()
                    .post("https://api.imgur.com/3/upload")
                    .prettyPeek()
                    .then()
                    .extract()
                    .response()
                    .jsonPath()
                    .getString("data.deletehash");
        }

        @Test
        void uploadMaxImageTest() {
            given()
                    .headers("Authorization", token)
                    .multiPart("image", new File(FormatAndSize.MAX_SIZE.getTitle()))
                    .expect()
                    .statusCode(200)
                    .body("success", is(true))
                    .body("data.account_url",equalTo(username))
                    .when()
                    .post("https://api.imgur.com/3/upload")
                    .prettyPeek()
                    .then()
                    .extract()
                    .response()
                    .jsonPath()
                    .getString("data.deletehash");
        }

        @Test
        void uploadSmallImageTest() {
            uploadedImageId = given()
                    .headers("Authorization", token)
                    .multiPart("image", new File(FormatAndSize.SMALL.getTitle()))
                    .expect()
                    .statusCode(200)
                    .body("success", is(true))
                    .body("data.account_url",equalTo(username))
                    .body("data.account_id",equalTo(145270851))
                    .body("data.width",equalTo(1))
                    .body("data.height",equalTo(1))
                    .when()
                    .post("https://api.imgur.com/3/upload")
                    .prettyPeek()
                    .then()
                    .extract()
                    .response()
                    .jsonPath()
                    .getString("data.deletehash");
        }

        @Test
        void uploadMediumImageTest() {
            uploadedImageId = given()
                    .headers("Authorization", token)
                    .multiPart("image", new File(FormatAndSize.MEDIUM.getTitle()))
                    .expect()
                    .statusCode(200)
                    .body("success", is(true))
                    .body("data.account_url",equalTo(username))
                    .body("data.account_id",equalTo(145270851))
                    .body("data.width",equalTo(10000))
                    .when()
                    .post("https://api.imgur.com/3/upload")
                    .prettyPeek()
                    .then()
                    .extract()
                    .response()
                    .jsonPath()
                    .getString("data.deletehash");
        }
        @Test
        void uploadHDImageTest() {
            uploadedImageId = given()
                    .headers("Authorization", token)
                    .multiPart("image", new File(FormatAndSize.HD.getTitle()))
                    .expect()
                    .statusCode(200)
                    .body("success", is(true))
                    .body("data.account_url",equalTo(username))
                    .body("data.account_id",equalTo(145270851))
                    .body("data.width",equalTo(10000))
                    .when()
                    .post("https://api.imgur.com/3/upload")
                    .prettyPeek()
                    .then()
                    .extract()
                    .response()
                    .jsonPath()
                    .getString("data.deletehash");
        }

        @Test
        void uploadJpgImageTest() {
            uploadedImageId = given()
                    .headers("Authorization", token)
                    .multiPart("image", new File(FormatAndSize.JPG.getTitle()))
                    .expect()
                    .statusCode(200)
                    .body("success", is(true))
                    .body("data.account_url",equalTo(username))
                    .body("data.account_id",equalTo(145270851))
                    .body("data.type",equalTo("image/jpeg"))
                    .when()
                    .post("https://api.imgur.com/3/upload")
                    .prettyPeek()
                    .then()
                    .extract()
                    .response()
                    .jsonPath()
                    .getString("data.deletehash");
        }

        @Test
        void uploadJngImageTest() {
            uploadedImageId = given()
                    .headers("Authorization", token)
                    .multiPart("image", new File(FormatAndSize.PNG.getTitle()))
                    .expect()
                    .statusCode(200)
                    .body("success", is(true))
                    .body("data.account_url",equalTo(username))
                    .body("data.account_id",equalTo(145270851))
                    .body("data.type",equalTo("image/png"))
                    .when()
                    .post("https://api.imgur.com/3/upload")
                    .prettyPeek()
                    .then()
                    .extract()
                    .response()
                    .jsonPath()
                    .getString("data.deletehash");
        }

        @Test
        void uploadTiffImageTest() {
            uploadedImageId = given()
                    .headers("Authorization", token)
                    .multiPart("image", new File(FormatAndSize.GIF.getTitle()))
                    .expect()
                    .statusCode(200)
                    .body("success", is(true))
                    .body("data.account_url",equalTo(username))
                    .body("data.account_id",equalTo(145270851))
                    .body("data.type",equalTo("image/gif"))
                    .when()
                    .post("https://api.imgur.com/3/upload")
                    .prettyPeek()
                    .then()
                    .extract()
                    .response()
                    .jsonPath()
                    .getString("data.deletehash");
        }

        @Test
        void uploadPngImageTest() {
            uploadedImageId = given()
                    .headers("Authorization", token)
                    .multiPart("image", new File(FormatAndSize.TIFF.getTitle()))
                    .expect()
                    .statusCode(200)
                    .body("success", is(true))
                    .body("data.account_url",equalTo(username))
                    .body("data.account_id",equalTo(145270851))
                    .body("data.type",equalTo("image/png"))
                    .when()
                    .post("https://api.imgur.com/3/upload")
                    .prettyPeek()
                    .then()
                    .extract()
                    .response()
                    .jsonPath()
                    .getString("data.deletehash");
        }

        @Test
        void uploadNotImageTest() {
            uploadedImageId = given()
                    .headers("Authorization", token)
                    .multiPart("image", new File(FormatAndSize.MP4_IMAGE.getTitle()))
                    .expect()
                    .statusCode(200)
                    .body("success", is(true))
                    .body("data.account_url",equalTo(username))
                    .body("data.account_id",equalTo(145270851))
                    .body("data.type",equalTo("video/mp4"))
                    .body("data.mp4",notNullValue())
                    .body("data.mp4_size",notNullValue())
                    .when()
                    .post("https://api.imgur.com/3/upload")
                    .prettyPeek()
                    .then()
                    .extract()
                    .response()
                    .jsonPath()
                    .getString("data.deletehash");
        }

        @AfterEach
        void tearDown() {
            given()
                    .headers("Authorization", token)
                    .when()
                    .delete("https://api.imgur.com/3/account/{username}/image/{deleteHash}", username, uploadedImageId)
                    .prettyPeek()
                    .then()
                    .statusCode(200);
        }


    }


