package com.my.newproject2;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.apache.http.protocol.HTTP;

public class FileUtil {
    private static void createNewFile(String str) {
        int lastIndexOf = str.lastIndexOf(File.separator);
        if (lastIndexOf > 0) {
            makeDir(str.substring(0, lastIndexOf));
        }
        File file = new File(str);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0044 A[SYNTHETIC, Splitter:B:26:0x0044] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String readFile(java.lang.String r6) {
        /*
            createNewFile(r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ IOException -> 0x0054, all -> 0x0040 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0054, all -> 0x0040 }
            r0.<init>(r6)     // Catch:{ IOException -> 0x0054, all -> 0x0040 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0054, all -> 0x0040 }
            r0 = 1024(0x400, float:1.435E-42)
            char[] r0 = new char[r0]     // Catch:{ IOException -> 0x0031 }
        L_0x0017:
            int r2 = r1.read(r0)     // Catch:{ IOException -> 0x0031 }
            if (r2 > 0) goto L_0x0027
            if (r1 == 0) goto L_0x0022
            r1.close()     // Catch:{ Exception -> 0x004d }
        L_0x0022:
            java.lang.String r0 = r3.toString()
            return r0
        L_0x0027:
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x0031 }
            r5 = 0
            r4.<init>(r0, r5, r2)     // Catch:{ IOException -> 0x0031 }
            r3.append(r4)     // Catch:{ IOException -> 0x0031 }
            goto L_0x0017
        L_0x0031:
            r0 = move-exception
        L_0x0032:
            r0.printStackTrace()     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0022
            r1.close()     // Catch:{ Exception -> 0x003b }
            goto L_0x0022
        L_0x003b:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0022
        L_0x0040:
            r0 = move-exception
            r1 = r2
        L_0x0042:
            if (r1 == 0) goto L_0x0047
            r1.close()     // Catch:{ Exception -> 0x0048 }
        L_0x0047:
            throw r0
        L_0x0048:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0047
        L_0x004d:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0022
        L_0x0052:
            r0 = move-exception
            goto L_0x0042
        L_0x0054:
            r0 = move-exception
            r1 = r2
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.newproject2.FileUtil.readFile(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0022 A[SYNTHETIC, Splitter:B:13:0x0022] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002e A[SYNTHETIC, Splitter:B:19:0x002e] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void writeFile(java.lang.String r4, java.lang.String r5) {
        /*
            createNewFile(r4)
            r2 = 0
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ IOException -> 0x001b, all -> 0x002b }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x001b, all -> 0x002b }
            r0.<init>(r4)     // Catch:{ IOException -> 0x001b, all -> 0x002b }
            r3 = 0
            r1.<init>(r0, r3)     // Catch:{ IOException -> 0x001b, all -> 0x002b }
            r1.write(r5)     // Catch:{ IOException -> 0x003f }
            r1.flush()     // Catch:{ IOException -> 0x003f }
            if (r1 == 0) goto L_0x001a
            r1.close()     // Catch:{ IOException -> 0x0037 }
        L_0x001a:
            return
        L_0x001b:
            r0 = move-exception
            r1 = r2
        L_0x001d:
            r0.printStackTrace()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x001a
            r1.close()     // Catch:{ IOException -> 0x0026 }
            goto L_0x001a
        L_0x0026:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x001a
        L_0x002b:
            r0 = move-exception
        L_0x002c:
            if (r2 == 0) goto L_0x0031
            r2.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0031:
            throw r0
        L_0x0032:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0031
        L_0x0037:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x001a
        L_0x003c:
            r0 = move-exception
            r2 = r1
            goto L_0x002c
        L_0x003f:
            r0 = move-exception
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.newproject2.FileUtil.writeFile(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x003b A[SYNTHETIC, Splitter:B:27:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0040 A[SYNTHETIC, Splitter:B:30:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0053 A[SYNTHETIC, Splitter:B:39:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0058 A[SYNTHETIC, Splitter:B:42:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void copyFile(java.lang.String r5, java.lang.String r6) {
        /*
            r2 = 0
            boolean r0 = isExistFile(r5)
            if (r0 != 0) goto L_0x0008
        L_0x0007:
            return
        L_0x0008:
            createNewFile(r6)
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0070, all -> 0x004e }
            r3.<init>(r5)     // Catch:{ IOException -> 0x0070, all -> 0x004e }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0074, all -> 0x006b }
            r0 = 0
            r1.<init>(r6, r0)     // Catch:{ IOException -> 0x0074, all -> 0x006b }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x0035 }
        L_0x001a:
            int r2 = r3.read(r0)     // Catch:{ IOException -> 0x0035 }
            if (r2 > 0) goto L_0x0030
            if (r3 == 0) goto L_0x0025
            r3.close()     // Catch:{ IOException -> 0x0066 }
        L_0x0025:
            if (r1 == 0) goto L_0x0007
            r1.close()     // Catch:{ IOException -> 0x002b }
            goto L_0x0007
        L_0x002b:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0007
        L_0x0030:
            r4 = 0
            r1.write(r0, r4, r2)     // Catch:{ IOException -> 0x0035 }
            goto L_0x001a
        L_0x0035:
            r0 = move-exception
        L_0x0036:
            r0.printStackTrace()     // Catch:{ all -> 0x006e }
            if (r3 == 0) goto L_0x003e
            r3.close()     // Catch:{ IOException -> 0x0049 }
        L_0x003e:
            if (r1 == 0) goto L_0x0007
            r1.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x0007
        L_0x0044:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0007
        L_0x0049:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x003e
        L_0x004e:
            r0 = move-exception
            r1 = r2
            r3 = r2
        L_0x0051:
            if (r3 == 0) goto L_0x0056
            r3.close()     // Catch:{ IOException -> 0x005c }
        L_0x0056:
            if (r1 == 0) goto L_0x005b
            r1.close()     // Catch:{ IOException -> 0x0061 }
        L_0x005b:
            throw r0
        L_0x005c:
            r2 = move-exception
            r2.printStackTrace()
            goto L_0x0056
        L_0x0061:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x005b
        L_0x0066:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0025
        L_0x006b:
            r0 = move-exception
            r1 = r2
            goto L_0x0051
        L_0x006e:
            r0 = move-exception
            goto L_0x0051
        L_0x0070:
            r0 = move-exception
            r1 = r2
            r3 = r2
            goto L_0x0036
        L_0x0074:
            r0 = move-exception
            r1 = r2
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.newproject2.FileUtil.copyFile(java.lang.String, java.lang.String):void");
    }

    public static void copyDir(String str, String str2) {
        File[] listFiles = new File(str).listFiles();
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                copyFile(file2.getPath(), String.valueOf(str2) + "/" + file2.getName());
            } else if (file2.isDirectory()) {
                copyDir(file2.getPath(), String.valueOf(str2) + "/" + file2.getName());
            }
        }
    }

    public static void moveFile(String str, String str2) {
        copyFile(str, str2);
        deleteFile(str);
    }

    public static void deleteFile(String str) {
        File file = new File(str);
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        deleteFile(file2.getAbsolutePath());
                    }
                    if (file2.isFile()) {
                        file2.delete();
                    }
                }
            }
            file.delete();
        }
    }

    public static boolean isExistFile(String str) {
        return new File(str).exists();
    }

    public static void makeDir(String str) {
        if (!isExistFile(str)) {
            new File(str).mkdirs();
        }
    }

    public static void listDir(String str, ArrayList<String> arrayList) {
        File[] listFiles;
        File file = new File(str);
        if (file.exists() && !file.isFile() && (listFiles = file.listFiles()) != null && listFiles.length > 0 && arrayList != null) {
            arrayList.clear();
            for (File absolutePath : listFiles) {
                arrayList.add(absolutePath.getAbsolutePath());
            }
        }
    }

    public static boolean isDirectory(String str) {
        if (!isExistFile(str)) {
            return false;
        }
        return new File(str).isDirectory();
    }

    public static boolean isFile(String str) {
        if (!isExistFile(str)) {
            return false;
        }
        return new File(str).isFile();
    }

    public static long getFileLength(String str) {
        if (!isExistFile(str)) {
            return 0;
        }
        return new File(str).length();
    }

    public static String getExternalStorageDir() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    public static String getPackageDataDir(Context context) {
        return context.getExternalFilesDir((String) null).getAbsolutePath();
    }

    public static String getPublicDir(String str) {
        return Environment.getExternalStoragePublicDirectory(str).getAbsolutePath();
    }

    public static String convertUriToFilePath(Context context, Uri uri) {
        String str;
        Uri uri2;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (isExternalStorageDocument(uri)) {
                String[] split = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(split[0])) {
                    str = Environment.getExternalStorageDirectory() + "/" + split[1];
                }
                str = null;
            } else if (isDownloadsDocument(uri)) {
                String documentId = DocumentsContract.getDocumentId(uri);
                if (!TextUtils.isEmpty(documentId) && documentId.startsWith("raw:")) {
                    return documentId.replaceFirst("raw:", "");
                }
                str = getDataColumn(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), (String) null, (String[]) null);
            } else {
                if (isMediaDocument(uri)) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str2 = split2[0];
                    if ("image".equals(str2)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str2)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str2)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    } else {
                        uri2 = null;
                    }
                    str = getDataColumn(context, uri2, "_id=?", new String[]{split2[1]});
                }
                str = null;
            }
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            str = getDataColumn(context, uri, (String) null, (String[]) null);
        } else {
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                str = uri.getPath();
            }
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            return URLDecoder.decode(str, HTTP.UTF_8);
        } catch (Exception e) {
            return null;
        }
    }

    private static String getDataColumn(Context context, Uri uri, String str, String[] strArr) {
        Throwable th;
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, (String) null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("_data"));
                        if (query == null) {
                            return string;
                        }
                        query.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (th != null) {
                        if (th != th) {
                            th.addSuppressed(th);
                        }
                        th = th;
                    }
                    try {
                        throw th;
                    } catch (Exception e) {
                    }
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            th = null;
        }
    }

    private static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    private static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    private static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    private static void saveBitmap(Bitmap bitmap, String str) {
        FileOutputStream fileOutputStream;
        createNewFile(str);
        Throwable th = null;
        try {
            fileOutputStream = new FileOutputStream(new File(str));
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        } catch (Throwable th2) {
            th = th2;
            if (th != null) {
                if (th != th) {
                    th.addSuppressed(th);
                }
                th = th;
            }
            try {
                throw th;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static Bitmap getScaledBitmap(String str, int i) {
        int i2;
        int i3;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        int width = decodeFile.getWidth();
        int height = decodeFile.getHeight();
        if (width > height) {
            i3 = (int) ((((float) i) / ((float) width)) * ((float) height));
            i2 = i;
        } else {
            i2 = (int) (((float) width) * (((float) i) / ((float) height)));
            i3 = i;
        }
        return Bitmap.createScaledBitmap(decodeFile, i2, i3, true);
    }

    public static int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        int i5 = 1;
        if (i4 > i2 || i3 > i) {
            int i6 = i4 / 2;
            int i7 = i3 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    public static Bitmap decodeSampleBitmapFromPath(String str, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = calculateInSampleSize(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static void resizeBitmapFileRetainRatio(String str, String str2, int i) {
        if (isExistFile(str)) {
            saveBitmap(getScaledBitmap(str, i), str2);
        }
    }

    public static void resizeBitmapFileToSquare(String str, String str2, int i) {
        if (isExistFile(str)) {
            saveBitmap(Bitmap.createScaledBitmap(BitmapFactory.decodeFile(str), i, i, true), str2);
        }
    }

    public static void resizeBitmapFileToCircle(String str, String str2) {
        if (isExistFile(str)) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            Bitmap createBitmap = Bitmap.createBitmap(decodeFile.getWidth(), decodeFile.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            canvas.drawCircle((float) (decodeFile.getWidth() / 2), (float) (decodeFile.getHeight() / 2), (float) (decodeFile.getWidth() / 2), paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(decodeFile, rect, rect, paint);
            saveBitmap(createBitmap, str2);
        }
    }

    public static void resizeBitmapFileWithRoundedBorder(String str, String str2, int i) {
        if (isExistFile(str)) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            Bitmap createBitmap = Bitmap.createBitmap(decodeFile.getWidth(), decodeFile.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
            RectF rectF = new RectF(rect);
            float f = (float) i;
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            canvas.drawRoundRect(rectF, f, f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(decodeFile, rect, rect, paint);
            saveBitmap(createBitmap, str2);
        }
    }

    public static void cropBitmapFileFromCenter(String str, String str2, int i, int i2) {
        int i3;
        int i4 = 0;
        if (isExistFile(str)) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            int width = decodeFile.getWidth();
            int height = decodeFile.getHeight();
            if (width >= i || height >= i2) {
                if (width > i) {
                    i3 = (width - i) / 2;
                } else {
                    i3 = 0;
                }
                if (height > i2) {
                    i4 = (height - i2) / 2;
                }
                if (i > width) {
                    i = width;
                }
                if (i2 > height) {
                    i2 = height;
                }
                saveBitmap(Bitmap.createBitmap(decodeFile, i3, i4, i, i2), str2);
            }
        }
    }

    public static void rotateBitmapFile(String str, String str2, float f) {
        if (isExistFile(str)) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            Matrix matrix = new Matrix();
            matrix.postRotate(f);
            saveBitmap(Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true), str2);
        }
    }

    public static void scaleBitmapFile(String str, String str2, float f, float f2) {
        if (isExistFile(str)) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            Matrix matrix = new Matrix();
            matrix.postScale(f, f2);
            saveBitmap(Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true), str2);
        }
    }

    public static void skewBitmapFile(String str, String str2, float f, float f2) {
        if (isExistFile(str)) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            Matrix matrix = new Matrix();
            matrix.postSkew(f, f2);
            saveBitmap(Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true), str2);
        }
    }

    public static void setBitmapFileColorFilter(String str, String str2, int i) {
        if (isExistFile(str)) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            Bitmap createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth() - 1, decodeFile.getHeight() - 1);
            Paint paint = new Paint();
            paint.setColorFilter(new LightingColorFilter(i, 1));
            new Canvas(createBitmap).drawBitmap(createBitmap, 0.0f, 0.0f, paint);
            saveBitmap(createBitmap, str2);
        }
    }

    public static void setBitmapFileBrightness(String str, String str2, float f) {
        if (isExistFile(str)) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            ColorMatrix colorMatrix = new ColorMatrix(new float[]{1.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 1.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 1.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
            Bitmap createBitmap = Bitmap.createBitmap(decodeFile.getWidth(), decodeFile.getHeight(), decodeFile.getConfig());
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint);
            saveBitmap(createBitmap, str2);
        }
    }

    public static void setBitmapFileContrast(String str, String str2, float f) {
        if (isExistFile(str)) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            ColorMatrix colorMatrix = new ColorMatrix(new float[]{f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
            Bitmap createBitmap = Bitmap.createBitmap(decodeFile.getWidth(), decodeFile.getHeight(), decodeFile.getConfig());
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint);
            saveBitmap(createBitmap, str2);
        }
    }

    public static int getJpegRotate(String str) {
        try {
            switch (new ExifInterface(str).getAttributeInt("Orientation", -1)) {
                case 3:
                    return 180;
                case 6:
                    return 90;
                case 8:
                    return 270;
                default:
                    return 0;
            }
        } catch (IOException e) {
            return 0;
        }
    }

    public static File createNewPictureFile(Context context) {
        return new File(String.valueOf(context.getExternalFilesDir(Environment.DIRECTORY_DCIM).getAbsolutePath()) + File.separator + (String.valueOf(new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date())) + ".jpg"));
    }
}
