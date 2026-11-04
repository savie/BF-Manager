package l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alipay.sdk.m.t.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽ᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8OH */
/* JADX INFO: loaded from: classes5.dex */
public final class C17908 implements InterfaceC13433 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC13433 f58648;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2467 f58649;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C8958 f58650;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C22384 f58651;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f58652;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C14924 f58653;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC13433 f58654;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C11195 f58655;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC13433 f58656;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Context f58657;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C10604 f58658;

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final void mo10894(InterfaceC4639 interfaceC4639) {
        interfaceC4639.getClass();
        this.f58656.mo10894(interfaceC4639);
        this.f58652.add(interfaceC4639);
        m41756(this.f58653, interfaceC4639);
        m41756(this.f58649, interfaceC4639);
        m41756(this.f58651, interfaceC4639);
        m41756(this.f58648, interfaceC4639);
        m41756(this.f58658, interfaceC4639);
        m41756(this.f58655, interfaceC4639);
        m41756(this.f58650, interfaceC4639);
    }

    public C17908(Context context, InterfaceC13433 interfaceC13433) {
        this.f58657 = context.getApplicationContext();
        interfaceC13433.getClass();
        this.f58656 = interfaceC13433;
        this.f58652 = new ArrayList();
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final long mo8326(C25368 c25368) {
        C20782.m47568(this.f58654 == null);
        Uri uri = c25368.f81907;
        String scheme = uri.getScheme();
        String str = C7116.f23455;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f58657;
        if (zIsEmpty || C17359.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f58653 == null) {
                    C14924 c14924 = new C14924(false);
                    this.f58653 = c14924;
                    m41755(c14924);
                }
                this.f58654 = this.f58653;
            } else {
                if (this.f58649 == null) {
                    C2467 c2467 = new C2467(context);
                    this.f58649 = c2467;
                    m41755(c2467);
                }
                this.f58654 = this.f58649;
            }
        } else if (!"asset".equals(scheme)) {
            if (!"content".equals(scheme)) {
                boolean zEquals = "rtmp".equals(scheme);
                InterfaceC13433 interfaceC13433 = this.f58656;
                if (!zEquals) {
                    if (!"udp".equals(scheme)) {
                        if (!e.m.equals(scheme)) {
                            if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                                this.f58654 = interfaceC13433;
                            } else {
                                if (this.f58650 == null) {
                                    C8958 c8958 = new C8958(context);
                                    this.f58650 = c8958;
                                    m41755(c8958);
                                }
                                this.f58654 = this.f58650;
                            }
                        } else {
                            if (this.f58655 == null) {
                                C11195 c11195 = new C11195(false);
                                this.f58655 = c11195;
                                m41755(c11195);
                            }
                            this.f58654 = this.f58655;
                        }
                    } else {
                        if (this.f58658 == null) {
                            C10604 c10604 = new C10604();
                            this.f58658 = c10604;
                            m41755(c10604);
                        }
                        this.f58654 = this.f58658;
                    }
                } else {
                    if (this.f58648 == null) {
                        try {
                            InterfaceC13433 interfaceC13434 = (InterfaceC13433) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.f58648 = interfaceC13434;
                            m41755(interfaceC13434);
                        } catch (ClassNotFoundException unused) {
                            C1896.m6517("Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e) {
                            throw new RuntimeException("Error instantiating RTMP extension", e);
                        }
                        if (this.f58648 == null) {
                            this.f58648 = interfaceC13433;
                        }
                    }
                    this.f58654 = this.f58648;
                }
            } else {
                if (this.f58651 == null) {
                    C22384 c22384 = new C22384(context);
                    this.f58651 = c22384;
                    m41755(c22384);
                }
                this.f58654 = this.f58651;
            }
        } else {
            if (this.f58649 == null) {
                C2467 c2468 = new C2467(context);
                this.f58649 = c2468;
                m41755(c2468);
            }
            this.f58654 = this.f58649;
        }
        return this.f58654.mo8326(c25368);
    }

    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) {
        InterfaceC13433 interfaceC13433 = this.f58654;
        interfaceC13433.getClass();
        return interfaceC13433.read(bArr, i, i2);
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ᩴ */
    public final Uri mo8327() {
        InterfaceC13433 interfaceC13433 = this.f58654;
        if (interfaceC13433 == null) {
            return null;
        }
        return interfaceC13433.mo8327();
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final Map mo10893() {
        InterfaceC13433 interfaceC13433 = this.f58654;
        return interfaceC13433 == null ? Collections.EMPTY_MAP : interfaceC13433.mo10893();
    }

    @Override // l.InterfaceC13433
    public final void close() {
        InterfaceC13433 interfaceC13433 = this.f58654;
        if (interfaceC13433 != null) {
            try {
                interfaceC13433.close();
            } finally {
                this.f58654 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41755(InterfaceC13433 interfaceC13433) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f58652;
            if (i >= arrayList.size()) {
                return;
            }
            interfaceC13433.mo10894((InterfaceC4639) arrayList.get(i));
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41756(InterfaceC13433 interfaceC13433, InterfaceC4639 interfaceC4639) {
        if (interfaceC13433 != null) {
            interfaceC13433.mo10894(interfaceC4639);
        }
    }
}
