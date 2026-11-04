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

/* JADX INFO: renamed from: l.֨ܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes3.dex */
public final class C1329 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f4761;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3041 f4762;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6025 f4763;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f4764;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10745 f4765;

    /* JADX WARN: Code duplicated, block: B:45:0x0185 A[Catch: all -> 0x0286, TryCatch #4 {all -> 0x0286, blocks: (B:15:0x00a2, B:16:0x00b3, B:18:0x00d4, B:20:0x00f5, B:21:0x00fd, B:23:0x010d, B:24:0x0121, B:25:0x0129, B:27:0x012f, B:30:0x013c, B:32:0x0148, B:34:0x015c, B:36:0x0164, B:38:0x016c, B:40:0x0174, B:42:0x017c, B:45:0x0185, B:47:0x018b), top: B:128:0x00a2, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x018b A[Catch: all -> 0x0286, TRY_LEAVE, TryCatch #4 {all -> 0x0286, blocks: (B:15:0x00a2, B:16:0x00b3, B:18:0x00d4, B:20:0x00f5, B:21:0x00fd, B:23:0x010d, B:24:0x0121, B:25:0x0129, B:27:0x012f, B:30:0x013c, B:32:0x0148, B:34:0x015c, B:36:0x0164, B:38:0x016c, B:40:0x0174, B:42:0x017c, B:45:0x0185, B:47:0x018b), top: B:128:0x00a2, outer: #1 }] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Exception {
        AbstractC22044 abstractC22044M49876;
        AbstractC22044 abstractC22044M12320 = C3787.m12320();
        SecureRandom secureRandom = new SecureRandom();
        do {
            long jCurrentTimeMillis = System.currentTimeMillis();
            abstractC22044M49876 = abstractC22044M12320.m49876(String.format("%08x%04x", Integer.valueOf((int) (jCurrentTimeMillis ^ (jCurrentTimeMillis >>> 32))), Integer.valueOf(secureRandom.nextInt() & 65535)));
        } while (abstractC22044M49876.mo2934());
        abstractC22044M49876.m49853();
        String name = abstractC22044M49876.getName();
        C6025 c6025 = this.f4763;
        c6025.f20607 = name;
        this.f4764 = abstractC22044M49876;
        C10745 c10745 = this.f4765;
        C17359.requireNonNull(c10745);
        C21151 c21151 = new C21151(c10745);
        C10745 c10746 = this.f4765;
        C17359.requireNonNull(c10746);
        AbstractC22044 abstractC22044M12322 = C3787.m12322(c6025);
        AbstractC22044 abstractC22044M49877 = abstractC22044M12322.m49876("packageUpload");
        AbstractC22044 abstractC22044M49878 = abstractC22044M12322.m49876("packageLocal");
        AbstractC22044 abstractC22044M49879 = abstractC22044M12322.m49876("temp");
        String str = this.f4761;
        C18602 c18602 = new C18602(C14584.m35193(str, new String[0]), false);
        if (c6025.f20616.f38632 && !c18602.m43217()) {
            throw new C4866(R.string.MT_Protector);
        }
        C22941 c22941 = new C22941(str);
        try {
            C25179 c25179 = new C25179(abstractC22044M49879);
            try {
                C25179 c251710 = new C25179(abstractC22044M49878);
                try {
                    c25179.m56135(0);
                    HashSet hashSet = new HashSet();
                    C8002 entry = c22941.getEntry(C2317.m7820(1));
                    int i = 2;
                    while (true) {
                        hashSet.add(entry.getName());
                        c25179.m56125(entry);
                        C5125.m15496(c22941.m51727(entry), c25179.m56119());
                        int i2 = i + 1;
                        C8002 entry2 = c22941.getEntry(C2317.m7820(i));
                        if (entry2 == null) {
                            break;
                        }
                        i = i2;
                        entry = entry2;
                        try {
                            c25179.close();
                            throw th;
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                            throw th;
                        }
                    }
                    C8002 entry3 = c22941.getEntry("AndroidManifest.xml");
                    hashSet.add(entry3.getName());
                    c25179.m56125(entry3);
                    C5125.m15496(c22941.m51727(entry3), c25179.m56119());
                    byte[] bArrM43219 = c18602.m43219();
                    if (bArrM43219 != null) {
                        c25179.m56124("_mt_protector/signature");
                        c25179.write(bArrM43219);
                    }
                    C5804 c5804M16929 = C5804.m16929(c6025.f20616.f38633);
                    if (!c5804M16929.f19944.isEmpty()) {
                        c25179.m56124("_mt_protector/mapping");
                        c25179.write(c5804M16929.toString().getBytes(Charset.defaultCharset()));
                    }
                    for (C8002 c8002 : c22941.m51742()) {
                        if (!c8002.isDirectory()) {
                            String name2 = c8002.getName();
                            if (name2.startsWith("META-INF/")) {
                                String lowerCase = name2.substring(9).toLowerCase(Locale.US);
                                if (!"manifest.mf".equals(lowerCase) && !lowerCase.endsWith(".sf") && !lowerCase.endsWith(".rsa") && !lowerCase.endsWith(".dsa") && !lowerCase.endsWith(".ec") && !lowerCase.startsWith("sig-")) {
                                    if (!hashSet.contains(name2)) {
                                        c251710.m56126(c8002, c22941);
                                    }
                                }
                            } else if (!hashSet.contains(name2)) {
                                c251710.m56126(c8002, c22941);
                            }
                        }
                    }
                    c251710.close();
                    c25179.close();
                    c22941.close();
                    if (c10746.m27399()) {
                        return;
                    }
                    C3374 c3374 = new C3374(abstractC22044M49879.mo4285());
                    c3374.m11078(c21151);
                    int i3 = 0;
                    OutputStream outputStreamM55008 = C24653.m55008(abstractC22044M49877.mo4289(false), 2);
                    try {
                        InputStream inputStreamMo4290 = abstractC22044M49879.mo4290();
                        try {
                            byte[] bArr = new byte[1048576];
                            while (true) {
                                int iM15487 = C5125.m15487(inputStreamMo4290, bArr, i3, 1048576);
                                if (iM15487 > 0) {
                                    outputStreamM55008.write(bArr, i3, iM15487);
                                    if (iM15487 < 1048576) {
                                        outputStreamM55008.flush();
                                    }
                                    c3374.m11079(iM15487);
                                    if (c10746.m27399()) {
                                        if (inputStreamMo4290 != null) {
                                            inputStreamMo4290.close();
                                        }
                                        outputStreamM55008.close();
                                        return;
                                    }
                                    i3 = 0;
                                } else {
                                    if (inputStreamMo4290 != null) {
                                        inputStreamMo4290.close();
                                    }
                                    outputStreamM55008.close();
                                    abstractC22044M49879.mo4296();
                                    String strM5611 = C1599.m5611(abstractC22044M49878, "MD5");
                                    c6025.f20609 = strM5611;
                                    if (strM5611 != null) {
                                        C6178 c6178 = new C6178();
                                        c6178.m17800(c6025.f20607);
                                        c6178.m17800(c6025.f20608);
                                        c6178.m17800(c6025.f20613);
                                        c6178.m17800(c6025.f20615);
                                        c6178.m17800(c6025.f20610);
                                        c6178.m17800(c6025.f20609);
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        c6025.f20614.compress(Bitmap.CompressFormat.PNG, 80, byteArrayOutputStream);
                                        c6178.m17806(byteArrayOutputStream.toByteArray());
                                        c6178.m17803(c6025.f20611);
                                        c6178.m17800(c6025.f20616.m30127());
                                        byte[] bArrM17798 = c6178.m17798();
                                        int length = bArrM17798.length;
                                        for (int i4 = 0; i4 < length; i4++) {
                                            bArrM17798[i4] = (byte) (bArrM17798[i4] ^ (i4 ^ length));
                                        }
                                        abstractC22044M12322.m49876("info").m49850(bArrM17798, 0, bArrM17798.length);
                                        return;
                                    }
                                    throw new Exception("Get md5 fail");
                                }
                            }
                        } catch (Throwable th2) {
                            if (inputStreamMo4290 == null) {
                                throw th2;
                            }
                            try {
                                inputStreamMo4290.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            outputStreamM55008.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    }
                } catch (Throwable th6) {
                    try {
                        c251710.close();
                        throw th6;
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                        throw th6;
                    }
                }
            } catch (Throwable th8) {
                c25179.close();
                throw th8;
            }
        } catch (Throwable th9) {
            try {
                c22941.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public C1329(ActivityC3041 activityC3041, C6025 c6025, String str) {
        this.f4762 = activityC3041;
        this.f4763 = c6025;
        this.f4761 = str;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C10745 c10745 = new C10745(this.f4762);
        c10745.m27397(R.string.MT_Protector);
        c10745.mo25916((Runnable) null);
        c10745.mo25931();
        this.f4765 = c10745;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f4765.m27399()) {
            AbstractC22044 abstractC22044 = this.f4764;
            if (abstractC22044 != null) {
                abstractC22044.mo4296();
                return;
            }
            return;
        }
        boolean zM43500 = ServiceC18703.m43500(this.f4763);
        ActivityC3041 activityC3041 = this.f4762;
        if (zM43500) {
            activityC3041.f9848 = C4681.unmodifiableList(C3787.m12317());
            activityC3041.f9857.notifyItemRangeInserted(0, 1);
            activityC3041.f9857.notifyItemRangeChanged(1, activityC3041.f9857.getItemCount() - 1);
        } else {
            activityC3041.f9848 = C4681.unmodifiableList(C3787.m12317());
            activityC3041.f9857.notifyDataSetChanged();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        AbstractC22044 abstractC22044 = this.f4764;
        if (abstractC22044 != null) {
            abstractC22044.mo4296();
        }
        this.f4762.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f4765.m27405();
    }
}
