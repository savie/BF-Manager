package l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Parcel;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: l.᩵᩹ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BLU */
/* JADX INFO: loaded from: classes4.dex */
public final class C19754 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC9171 f63477 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f63480 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f63479 = null;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object f63476 = new Object();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ServiceConnectionC19048 f63478 = new ServiceConnectionC19048(this);

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if (r6.versionCode >= 1) goto L14;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m44945(android.content.Context r6) {
        /*
            r0 = 0
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            java.lang.String r1 = "com.heytap.openid"
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            r2 = 28
            r3 = 1
            if (r1 < r2) goto L1f
            if (r6 == 0) goto L26
            long r1 = r6.getLongVersionCode()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            r4 = 1
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L25
        L1f:
            if (r6 == 0) goto L26
            int r6 = r6.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            if (r6 < r3) goto L26
        L25:
            return r3
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19754.m44945(android.content.Context):boolean");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m44946(Context context) {
        Signature[] signatureArr;
        if (TextUtils.isEmpty(this.f63480)) {
            this.f63480 = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.f63479)) {
            String string = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.f63480, 64).signatures;
            } catch (PackageManager.NameNotFoundException unused) {
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        byte[] bArrDigest = messageDigest.digest(byteArray);
                        StringBuilder sb = new StringBuilder();
                        for (byte b : bArrDigest) {
                            sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
                        }
                        string = sb.toString();
                    }
                } catch (NoSuchAlgorithmException unused2) {
                }
            }
            this.f63479 = string;
        }
        InterfaceC9171 interfaceC9171 = this.f63477;
        String str = this.f63480;
        String str2 = this.f63479;
        C15521 c15521 = (C15521) interfaceC9171;
        c15521.getClass();
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeString("OUID");
            c15521.f50531.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            String string2 = parcelObtain2.readString();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return TextUtils.isEmpty(string2) ? "" : string2;
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }
}
