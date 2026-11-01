package l;

import android.media.ResourceBusyException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: l.᩸᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08RN */
/* JADX INFO: loaded from: classes5.dex */
public final class C21906 implements InterfaceC16967 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final UUID f71070;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC14113 f71071;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2149 f71072;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean f71073;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Set f71074;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C14146 f71075;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C15557 f71076;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C9724 f71077;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f71078;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C7089 f71079;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC3560 f71080;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile HandlerC5678 f71081;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5407 f71082;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C14146 f71083;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ArrayList f71084;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Handler f71085;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Looper f71086;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Set f71087;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int[] f71088;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f71089;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f71090;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashMap f71091;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public byte[] f71092;

    public C21906(UUID uuid, C8015 c8015, C5407 c5407, HashMap map, boolean z, int[] iArr, boolean z2, C1619 c1619, long j) {
        uuid.getClass();
        C2023.m6506("Use C.CLEARKEY_UUID instead", !C1297.f5564.equals(uuid));
        this.f71070 = uuid;
        this.f71072 = c8015;
        this.f71082 = c5407;
        this.f71091 = map;
        this.f71073 = z;
        this.f71088 = iArr;
        this.f71090 = z2;
        this.f71071 = c1619;
        this.f71079 = new C7089();
        this.f71076 = new C15557(this);
        this.f71084 = new ArrayList();
        this.f71087 = Collections.newSetFromMap(new IdentityHashMap());
        this.f71074 = Collections.newSetFromMap(new IdentityHashMap());
        this.f71089 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48726(byte[] bArr) {
        C2023.m6510(this.f71084.isEmpty());
        this.f71092 = bArr;
    }

    @Override // l.InterfaceC16967
    /* JADX INFO: renamed from: ܰ */
    public final void mo39761() {
        m48714(true);
        int i = this.f71078;
        this.f71078 = i + 1;
        if (i != 0) {
            return;
        }
        if (this.f71080 == null) {
            InterfaceC3560 interfaceC3560Mo6703 = this.f71072.mo6703(this.f71070);
            this.f71080 = interfaceC3560Mo6703;
            interfaceC3560Mo6703.mo8045(new C2855(this));
        } else {
            if (this.f71089 == -9223372036854775807L) {
                return;
            }
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.f71084;
                if (i2 >= arrayList.size()) {
                    return;
                }
                ((C14146) arrayList.get(i2)).mo28383((C21200) null);
                i2++;
            }
        }
    }

    @Override // l.InterfaceC16967
    /* JADX INFO: renamed from: ۙ */
    public final void mo39758() {
        m48714(true);
        int i = this.f71078 - 1;
        this.f71078 = i;
        if (i != 0) {
            return;
        }
        if (this.f71089 != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f71084);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C14146) arrayList.get(i2)).mo28386((C21200) null);
            }
        }
        AbstractC0477 it = AbstractC23844.copyOf((Collection) this.f71087).iterator();
        while (it.hasNext()) {
            ((C4266) it.next()).mo3203();
        }
        m48719();
    }

    @Override // l.InterfaceC16967
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC0738 mo39760(C21200 c21200, final C7648 c7648) {
        C2023.m6510(this.f71078 > 0);
        C2023.m6508(this.f71086);
        final C4266 c4266 = new C4266(this, c21200);
        Handler handler = this.f71085;
        handler.getClass();
        handler.post(new Runnable() { // from class: l.۬᩻ۙ
            @Override // java.lang.Runnable
            public final void run() {
                C4266.m12060(c4266, c7648);
            }
        });
        return c4266;
    }

    @Override // l.InterfaceC16967
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC19790 mo39757(C21200 c21200, C7648 c7648) {
        m48714(false);
        C2023.m6510(this.f71078 > 0);
        C2023.m6508(this.f71086);
        return m48712(this.f71086, c21200, c7648, true);
    }

    @Override // l.InterfaceC16967
    /* JADX INFO: renamed from: ۙ */
    public final int mo39756(C7648 c7648) {
        m48714(false);
        InterfaceC3560 interfaceC3560 = this.f71080;
        interfaceC3560.getClass();
        int iMo8040 = interfaceC3560.mo8040();
        C8354 c8354 = c7648.f25271;
        if (c8354 == null) {
            int iM17981 = C6632.m17981(c7648.f25265);
            int i = 0;
            while (true) {
                int[] iArr = this.f71088;
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == iM17981) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return 0;
            }
        } else if (this.f71092 == null) {
            UUID uuid = this.f71070;
            if (m48708(c8354, uuid, true).isEmpty()) {
                if (c8354.f28972 == 1 && c8354.m21876(0).m43619(C1297.f5564)) {
                    C0303.m1848("DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = c8354.f28971;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return iMo8040;
    }

    @Override // l.InterfaceC16967
    /* JADX INFO: renamed from: ۙ */
    public final void mo39759(Looper looper, C9724 c9724) {
        synchronized (this) {
            Looper looper2 = this.f71086;
            if (looper2 == null) {
                this.f71086 = looper;
                this.f71085 = new Handler(looper);
            } else {
                C2023.m6510(looper2 == looper);
                this.f71085.getClass();
            }
        }
        this.f71077 = c9724;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19790 m48712(Looper looper, C21200 c21200, C7648 c7648, boolean z) {
        ArrayList arrayListM48708;
        if (this.f71081 == null) {
            this.f71081 = new HandlerC5678(this, looper);
        }
        C8354 c8354 = c7648.f25271;
        int i = 0;
        C14146 c14146 = null;
        if (c8354 == null) {
            int iM17981 = C6632.m17981(c7648.f25265);
            InterfaceC3560 interfaceC3560 = this.f71080;
            interfaceC3560.getClass();
            if (interfaceC3560.mo8040() != 2 || !C4701.f16595) {
                int[] iArr = this.f71088;
                while (true) {
                    if (i >= iArr.length) {
                        i = -1;
                        break;
                    }
                    if (iArr[i] == iM17981) {
                        break;
                    }
                    i++;
                }
                if (i != -1 && interfaceC3560.mo8040() != 1) {
                    C14146 c14147 = this.f71083;
                    if (c14147 == null) {
                        C14146 c14146M48711 = m48711(AbstractC22433.of(), true, (C21200) null, z);
                        this.f71084.add(c14146M48711);
                        this.f71083 = c14146M48711;
                    } else {
                        c14147.mo28383((C21200) null);
                    }
                    return this.f71083;
                }
            }
            return null;
        }
        if (this.f71092 == null) {
            arrayListM48708 = m48708(c8354, this.f71070, false);
            if (arrayListM48708.isEmpty()) {
                C22612 c22612 = new C22612("Media does not support uuid: " + this.f71070);
                C0303.m1854("DRM error", c22612);
                if (c21200 != null) {
                    c21200.m47660(c22612);
                }
                return new C11323(new C8501(6003, c22612));
            }
        } else {
            arrayListM48708 = null;
        }
        if (!this.f71073) {
            c14146 = this.f71075;
        } else {
            for (C14146 c14148 : this.f71084) {
                if (C13638.equals(c14148.f46439, arrayListM48708)) {
                    c14146 = c14148;
                    break;
                }
            }
        }
        if (c14146 == null) {
            C14146 c14146M48712 = m48711((List) arrayListM48708, false, c21200, z);
            if (!this.f71073) {
                this.f71075 = c14146M48712;
            }
            this.f71084.add(c14146M48712);
            return c14146M48712;
        }
        c14146.mo28383(c21200);
        return c14146;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14146 m48711(List list, boolean z, C21200 c21200, boolean z2) {
        C14146 c14146M48710 = m48710(list, z, c21200);
        boolean zM48715 = m48715(c14146M48710);
        long j = this.f71089;
        Set set = this.f71074;
        if (zM48715 && !set.isEmpty()) {
            AbstractC0477 it = AbstractC23844.copyOf((Collection) set).iterator();
            while (it.hasNext()) {
                ((InterfaceC19790) it.next()).mo28386(null);
            }
            c14146M48710.mo28386(c21200);
            if (j != -9223372036854775807L) {
                c14146M48710.mo28386((C21200) null);
            }
            c14146M48710 = m48710(list, z, c21200);
        }
        if (m48715(c14146M48710) && z2) {
            Set set2 = this.f71087;
            if (!set2.isEmpty()) {
                AbstractC0477 it2 = AbstractC23844.copyOf((Collection) set2).iterator();
                while (it2.hasNext()) {
                    ((C4266) it2.next()).mo3203();
                }
                if (!set.isEmpty()) {
                    AbstractC0477 it3 = AbstractC23844.copyOf((Collection) set).iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC19790) it3.next()).mo28386(null);
                    }
                }
                c14146M48710.mo28386(c21200);
                if (j != -9223372036854775807L) {
                    c14146M48710.mo28386((C21200) null);
                }
                return m48710(list, z, c21200);
            }
        }
        return c14146M48710;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m48715(InterfaceC19790 interfaceC19790) {
        C14146 c14146 = (C14146) interfaceC19790;
        if (c14146.getState() != 1) {
            return false;
        }
        C8501 error = c14146.getError();
        error.getClass();
        Throwable cause = error.getCause();
        return (cause instanceof ResourceBusyException) || C17672.m41150(cause);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14146 m48710(List list, boolean z, C21200 c21200) {
        this.f71080.getClass();
        boolean z2 = this.f71090 | z;
        InterfaceC3560 interfaceC3560 = this.f71080;
        byte[] bArr = this.f71092;
        Looper looper = this.f71086;
        looper.getClass();
        C9724 c9724 = this.f71077;
        c9724.getClass();
        C14146 c14146 = new C14146(this.f71070, interfaceC3560, this.f71079, this.f71076, list, z2, z, bArr, this.f71091, this.f71082, looper, this.f71071, c9724);
        c14146.mo28383(c21200);
        if (this.f71089 != -9223372036854775807L) {
            c14146.mo28383((C21200) null);
        }
        return c14146;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m48719() {
        if (this.f71080 != null && this.f71078 == 0 && this.f71084.isEmpty() && this.f71087.isEmpty()) {
            InterfaceC3560 interfaceC3560 = this.f71080;
            interfaceC3560.getClass();
            interfaceC3560.mo8044();
            this.f71080 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48714(boolean z) {
        if (z && this.f71086 == null) {
            C0303.m1852("DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f71086;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            C0303.m1852("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f71086.getThread().getName(), new IllegalStateException());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m48708(C8354 c8354, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(c8354.f28972);
        for (int i = 0; i < c8354.f28972; i++) {
            C18937 c18937M21876 = c8354.m21876(i);
            if ((c18937M21876.m43619(uuid) || (C1297.f5561.equals(uuid) && c18937M21876.m43619(C1297.f5564))) && (c18937M21876.f61264 != null || z)) {
                arrayList.add(c18937M21876);
            }
        }
        return arrayList;
    }
}
