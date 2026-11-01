package l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alipay.sdk.m.t.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ۛ۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8OH */
/* JADX INFO: loaded from: classes3.dex */
public final class C5906 implements InterfaceC15785 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C11945 f20147;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Context f20148;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC15785 f20149;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15079 f20150;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C8729 f20151;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList f20152;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C19312 f20153;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C18294 f20154;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15785 f20155;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC15785 f20156;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C10534 f20157;

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final void mo11161(InterfaceC19706 interfaceC19706) {
        interfaceC19706.getClass();
        this.f20155.mo11161(interfaceC19706);
        this.f20152.add(interfaceC19706);
        m16177(this.f20147, interfaceC19706);
        m16177(this.f20150, interfaceC19706);
        m16177(this.f20153, interfaceC19706);
        m16177(this.f20149, interfaceC19706);
        m16177(this.f20157, interfaceC19706);
        m16177(this.f20151, interfaceC19706);
        m16177(this.f20154, interfaceC19706);
    }

    public C5906(Context context, InterfaceC15785 interfaceC15785) {
        this.f20148 = context.getApplicationContext();
        interfaceC15785.getClass();
        this.f20155 = interfaceC15785;
        this.f20152 = new ArrayList();
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final long mo9272(C12257 c12257) {
        C2023.m6510(this.f20156 == null);
        Uri uri = c12257.f41015;
        String scheme = uri.getScheme();
        String str = C17983.f57504;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f20148;
        if (zIsEmpty || C13638.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f20147 == null) {
                    C11945 c11945 = new C11945(false);
                    this.f20147 = c11945;
                    m16176(c11945);
                }
                this.f20156 = this.f20147;
            } else {
                if (this.f20150 == null) {
                    C15079 c15079 = new C15079(context);
                    this.f20150 = c15079;
                    m16176(c15079);
                }
                this.f20156 = this.f20150;
            }
        } else if (!"asset".equals(scheme)) {
            if (!"content".equals(scheme)) {
                boolean zEquals = "rtmp".equals(scheme);
                InterfaceC15785 interfaceC15785 = this.f20155;
                if (!zEquals) {
                    if (!"udp".equals(scheme)) {
                        if (!e.m.equals(scheme)) {
                            if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                                this.f20156 = interfaceC15785;
                            } else {
                                if (this.f20154 == null) {
                                    C18294 c18294 = new C18294(context);
                                    this.f20154 = c18294;
                                    m16176(c18294);
                                }
                                this.f20156 = this.f20154;
                            }
                        } else {
                            if (this.f20151 == null) {
                                C8729 c8729 = new C8729(false);
                                this.f20151 = c8729;
                                m16176(c8729);
                            }
                            this.f20156 = this.f20151;
                        }
                    } else {
                        if (this.f20157 == null) {
                            C10534 c10534 = new C10534();
                            this.f20157 = c10534;
                            m16176(c10534);
                        }
                        this.f20156 = this.f20157;
                    }
                } else {
                    if (this.f20149 == null) {
                        try {
                            InterfaceC15785 interfaceC15786 = (InterfaceC15785) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.f20149 = interfaceC15786;
                            m16176(interfaceC15786);
                        } catch (ClassNotFoundException unused) {
                            C0303.m1848("Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e) {
                            throw new RuntimeException("Error instantiating RTMP extension", e);
                        }
                        if (this.f20149 == null) {
                            this.f20149 = interfaceC15785;
                        }
                    }
                    this.f20156 = this.f20149;
                }
            } else {
                if (this.f20153 == null) {
                    C19312 c19312 = new C19312(context);
                    this.f20153 = c19312;
                    m16176(c19312);
                }
                this.f20156 = this.f20153;
            }
        } else {
            if (this.f20150 == null) {
                C15079 c150710 = new C15079(context);
                this.f20150 = c150710;
                m16176(c150710);
            }
            this.f20156 = this.f20150;
        }
        return this.f20156.mo9272(c12257);
    }

    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) {
        InterfaceC15785 interfaceC15785 = this.f20156;
        interfaceC15785.getClass();
        return interfaceC15785.read(bArr, i, i2);
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۚ */
    public final Uri mo9274() {
        InterfaceC15785 interfaceC15785 = this.f20156;
        if (interfaceC15785 == null) {
            return null;
        }
        return interfaceC15785.mo9274();
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final Map mo9273() {
        InterfaceC15785 interfaceC15785 = this.f20156;
        return interfaceC15785 == null ? Collections.EMPTY_MAP : interfaceC15785.mo9273();
    }

    @Override // l.InterfaceC15785
    public final void close() {
        InterfaceC15785 interfaceC15785 = this.f20156;
        if (interfaceC15785 != null) {
            try {
                interfaceC15785.close();
            } finally {
                this.f20156 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m16176(InterfaceC15785 interfaceC15785) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f20152;
            if (i >= arrayList.size()) {
                return;
            }
            interfaceC15785.mo11161((InterfaceC19706) arrayList.get(i));
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16177(InterfaceC15785 interfaceC15785, InterfaceC19706 interfaceC19706) {
        if (interfaceC15785 != null) {
            interfaceC15785.mo11161(interfaceC19706);
        }
    }
}
