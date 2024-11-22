package com.my.newproject2;

import android.app.Activity;

public class DebugActivity extends Activity {
    private String[] exceptionMessages = {"Invalid string operation\n", "Invalid list operation\n", "Invalid arithmetical operation\n", "Invalid toNumber block operation\n", "Invalid intent operation"};
    private String[] exceptionTypes = {"StringIndexOutOfBoundsException", "IndexOutOfBoundsException", "ArithmeticException", "NumberFormatException", "ActivityNotFoundException"};

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1.isEmpty() != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            r2 = 0
            super.onCreate(r8)
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r1 = ""
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x00c2
            java.lang.String r3 = "error"
            java.lang.String r0 = r0.getStringExtra(r3)
            java.lang.String r3 = "\n"
            java.lang.String[] r3 = r0.split(r3)
        L_0x001a:
            java.lang.String[] r4 = r7.exceptionTypes     // Catch:{ Exception -> 0x00a4 }
            int r4 = r4.length     // Catch:{ Exception -> 0x00a4 }
            if (r2 < r4) goto L_0x0044
        L_0x001f:
            boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x00a4 }
            if (r2 == 0) goto L_0x00c2
        L_0x0025:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r7)
            java.lang.String r2 = "An error occurred"
            r1.setTitle(r2)
            r1.setMessage(r0)
            java.lang.String r0 = "End Application"
            com.my.newproject2.DebugActivity$1 r2 = new com.my.newproject2.DebugActivity$1
            r2.<init>()
            r1.setPositiveButton(r0, r2)
            android.app.AlertDialog r0 = r1.create()
            r0.show()
            return
        L_0x0044:
            r4 = 0
            r4 = r3[r4]     // Catch:{ Exception -> 0x00a4 }
            java.lang.String[] r5 = r7.exceptionTypes     // Catch:{ Exception -> 0x00a4 }
            r5 = r5[r2]     // Catch:{ Exception -> 0x00a4 }
            boolean r4 = r4.contains(r5)     // Catch:{ Exception -> 0x00a4 }
            if (r4 == 0) goto L_0x00a0
            java.lang.String[] r4 = r7.exceptionMessages     // Catch:{ Exception -> 0x00a4 }
            r1 = r4[r2]     // Catch:{ Exception -> 0x00a4 }
            r4 = 0
            r4 = r3[r4]     // Catch:{ Exception -> 0x00a4 }
            java.lang.String[] r5 = r7.exceptionTypes     // Catch:{ Exception -> 0x00a4 }
            r5 = r5[r2]     // Catch:{ Exception -> 0x00a4 }
            int r4 = r4.indexOf(r5)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String[] r5 = r7.exceptionTypes     // Catch:{ Exception -> 0x00a4 }
            r2 = r5[r2]     // Catch:{ Exception -> 0x00a4 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x00a4 }
            int r2 = r2 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r5 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00a4 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x00a4 }
            r5 = 0
            r5 = r3[r5]     // Catch:{ Exception -> 0x00a4 }
            r6 = 0
            r3 = r3[r6]     // Catch:{ Exception -> 0x00a4 }
            int r3 = r3.length()     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r2 = r5.substring(r2, r3)     // Catch:{ Exception -> 0x00a4 }
            java.lang.StringBuilder r2 = r4.append(r2)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x00a4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00a4 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r3 = "\n\nDetailed error message:\n"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ Exception -> 0x00a4 }
            java.lang.StringBuilder r2 = r2.append(r0)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x00a4 }
            goto L_0x001f
        L_0x00a0:
            int r2 = r2 + 1
            goto L_0x001a
        L_0x00a4:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.<init>(r1)
            java.lang.String r1 = "\n\nError while getting error: "
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            goto L_0x0025
        L_0x00c2:
            r0 = r1
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.newproject2.DebugActivity.onCreate(android.os.Bundle):void");
    }
}
