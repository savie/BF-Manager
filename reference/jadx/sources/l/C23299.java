package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import bin.mt.plus.R;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩺᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes.dex */
public final class C23299 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f75550;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f75551;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11780 f75552;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3541 f75553;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C1777 f75554;

    /* JADX WARN: Code duplicated, block: B:45:0x0185 A[Catch: all -> 0x0285, TryCatch #4 {all -> 0x0285, blocks: (B:15:0x00a2, B:16:0x00b3, B:18:0x00d4, B:20:0x00f5, B:21:0x00fd, B:23:0x010d, B:24:0x0121, B:25:0x0129, B:27:0x012f, B:30:0x013c, B:32:0x0148, B:34:0x015c, B:36:0x0164, B:38:0x016c, B:40:0x0174, B:42:0x017c, B:45:0x0185, B:47:0x018b), top: B:127:0x00a2, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x018b A[Catch: all -> 0x0285, TRY_LEAVE, TryCatch #4 {all -> 0x0285, blocks: (B:15:0x00a2, B:16:0x00b3, B:18:0x00d4, B:20:0x00f5, B:21:0x00fd, B:23:0x010d, B:24:0x0121, B:25:0x0129, B:27:0x012f, B:30:0x013c, B:32:0x0148, B:34:0x015c, B:36:0x0164, B:38:0x016c, B:40:0x0174, B:42:0x017c, B:45:0x0185, B:47:0x018b), top: B:127:0x00a2, outer: #1 }] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws Exception {
        AbstractC20745 abstractC20745M46690;
        AbstractC20745 abstractC20745M15003 = C5429.m15003();
        SecureRandom secureRandom = new SecureRandom();
        do {
            long jCurrentTimeMillis = System.currentTimeMillis();
            abstractC20745M46690 = abstractC20745M15003.m46690(String.format("%08x%04x", Integer.valueOf((int) (jCurrentTimeMillis ^ (jCurrentTimeMillis >>> 32))), Integer.valueOf(secureRandom.nextInt() & 65535)));
        } while (abstractC20745M46690.mo33975());
        abstractC20745M46690.m46739();
        String name = abstractC20745M46690.getName();
        C11780 c11780 = this.f75552;
        c11780.f39567 = name;
        this.f75550 = abstractC20745M46690;
        C1777 c1777 = this.f75554;
        C13638.requireNonNull(c1777);
        C1438 c1438 = new C1438(c1777);
        C1777 c1778 = this.f75554;
        C13638.requireNonNull(c1778);
        AbstractC20745 abstractC20745M15005 = C5429.m15005(c11780);
        AbstractC20745 abstractC20745M46691 = abstractC20745M15005.m46690("packageUpload");
        AbstractC20745 abstractC20745M46692 = abstractC20745M15005.m46690("packageLocal");
        AbstractC20745 abstractC20745M46693 = abstractC20745M15005.m46690("temp");
        String str = this.f75551;
        C16674 c16674 = new C16674(C5553.m15313(str, new String[0]), false);
        if (c11780.f39573.f45783 && !c16674.m39138()) {
            throw new C4987(R.string.MT_Protector);
        }
        C2455 c2455 = new C2455(str);
        try {
            C22918 c22918 = new C22918(abstractC20745M46693);
            try {
                C22918 c22919 = new C22918(abstractC20745M46692);
                try {
                    c22918.m50733(0);
                    HashSet hashSet = new HashSet();
                    C12107 entry = c2455.getEntry(C12035.m29933(1));
                    int i = 2;
                    while (true) {
                        hashSet.add(entry.getName());
                        c22918.m50727(entry);
                        C20010.m45301(c2455.m7471(entry), c22918.m50720());
                        int i2 = i + 1;
                        C12107 entry2 = c2455.getEntry(C12035.m29933(i));
                        if (entry2 == null) {
                            break;
                        }
                        i = i2;
                        entry = entry2;
                        try {
                            c22918.close();
                            throw th;
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                            throw th;
                        }
                    }
                    C12107 entry3 = c2455.getEntry("AndroidManifest.xml");
                    hashSet.add(entry3.getName());
                    c22918.m50727(entry3);
                    C20010.m45301(c2455.m7471(entry3), c22918.m50720());
                    byte[] bArrM39140 = c16674.m39140();
                    if (bArrM39140 != null) {
                        c22918.m50725("_mt_protector/signature");
                        c22918.write(bArrM39140);
                    }
                    C19999 c19999M45285 = C19999.m45285(c11780.f39573.f45785);
                    if (!c19999M45285.f64015.isEmpty()) {
                        c22918.m50725("_mt_protector/mapping");
                        c22918.write(c19999M45285.toString().getBytes(Charset.defaultCharset()));
                    }
                    for (C12107 c12107 : c2455.m7466()) {
                        if (!c12107.isDirectory()) {
                            String name2 = c12107.getName();
                            if (name2.startsWith("META-INF/")) {
                                String lowerCase = name2.substring(9).toLowerCase(Locale.US);
                                if (!"manifest.mf".equals(lowerCase) && !lowerCase.endsWith(".sf") && !lowerCase.endsWith(".rsa") && !lowerCase.endsWith(".dsa") && !lowerCase.endsWith(".ec") && !lowerCase.startsWith("sig-")) {
                                    if (!hashSet.contains(name2)) {
                                        c22919.m50728(c12107, c2455);
                                    }
                                }
                            } else if (!hashSet.contains(name2)) {
                                c22919.m50728(c12107, c2455);
                            }
                        }
                    }
                    c22919.close();
                    c22918.close();
                    c2455.close();
                    if (c1778.m5824()) {
                        return;
                    }
                    C8516 c8516 = new C8516(abstractC20745M46693.mo33964());
                    c8516.m22241(c1438);
                    OutputStream outputStreamM26261 = C10362.m26261(abstractC20745M46691.mo33976(false), 2);
                    try {
                        InputStream inputStreamMo33970 = abstractC20745M46693.mo33970();
                        try {
                            byte[] bArr = new byte[1048576];
                            do {
                                int iM45293 = C20010.m45293(inputStreamMo33970, bArr, 1048576);
                                if (iM45293 > 0) {
                                    outputStreamM26261.write(bArr, 0, iM45293);
                                    if (iM45293 < 1048576) {
                                        outputStreamM26261.flush();
                                    }
                                    c8516.m22242(iM45293);
                                } else {
                                    if (inputStreamMo33970 != null) {
                                        inputStreamMo33970.close();
                                    }
                                    outputStreamM26261.close();
                                    abstractC20745M46693.mo24647();
                                    String strM11362 = C3907.m11362(abstractC20745M46692, "MD5");
                                    c11780.f39568 = strM11362;
                                    if (strM11362 != null) {
                                        C11018 c11018 = new C11018();
                                        c11018.m27786(c11780.f39567);
                                        c11018.m27786(c11780.f39569);
                                        c11018.m27786(c11780.f39570);
                                        c11018.m27786(c11780.f39572);
                                        c11018.m27786(c11780.f39565);
                                        c11018.m27786(c11780.f39568);
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        c11780.f39564.compress(Bitmap.CompressFormat.PNG, 80, byteArrayOutputStream);
                                        c11018.m27794(byteArrayOutputStream.toByteArray());
                                        c11018.m27791(c11780.f39574);
                                        c11018.m27786(c11780.f39573.m33733());
                                        byte[] bArrM27796 = c11018.m27796();
                                        int length = bArrM27796.length;
                                        for (int i3 = 0; i3 < length; i3++) {
                                            bArrM27796[i3] = (byte) (bArrM27796[i3] ^ (i3 ^ length));
                                        }
                                        abstractC20745M15005.m46690("info").m46704(bArrM27796, 0, bArrM27796.length);
                                        return;
                                    }
                                    throw new Exception("Get md5 fail");
                                }
                            } while (!c1778.m5824());
                            if (inputStreamMo33970 != null) {
                                inputStreamMo33970.close();
                            }
                            outputStreamM26261.close();
                        } catch (Throwable th2) {
                            if (inputStreamMo33970 == null) {
                                throw th2;
                            }
                            try {
                                inputStreamMo33970.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            outputStreamM26261.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    }
                } catch (Throwable th6) {
                    try {
                        c22919.close();
                        throw th6;
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                        throw th6;
                    }
                }
            } catch (Throwable th8) {
                c22918.close();
                throw th8;
            }
        } catch (Throwable th9) {
            try {
                c2455.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public C23299(ActivityC3541 activityC3541, C11780 c11780, String str) {
        this.f75553 = activityC3541;
        this.f75552 = c11780;
        this.f75551 = str;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C1777 c1777 = new C1777(this.f75553);
        c1777.m5837(R.string.MT_Protector);
        c1777.mo5828((Runnable) null);
        c1777.mo5843();
        this.f75554 = c1777;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f75554.m5824()) {
            AbstractC20745 abstractC20745 = this.f75550;
            if (abstractC20745 != null) {
                abstractC20745.mo24647();
                return;
            }
            return;
        }
        boolean zM51045 = ServiceC23069.m51045(this.f75552);
        ActivityC3541 activityC3541 = this.f75553;
        if (zM51045) {
            activityC3541.f13040 = C0561.unmodifiableList(C5429.m15000());
            activityC3541.f13039.notifyItemRangeInserted(0, 1);
            activityC3541.f13039.notifyItemRangeChanged(1, activityC3541.f13039.getItemCount() - 1);
        } else {
            activityC3541.f13040 = C0561.unmodifiableList(C5429.m15000());
            activityC3541.f13039.notifyDataSetChanged();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        AbstractC20745 abstractC20745 = this.f75550;
        if (abstractC20745 != null) {
            abstractC20745.mo24647();
        }
        this.f75553.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f75554.m5825();
    }
}
