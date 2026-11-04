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

/* JADX INFO: renamed from: l.ۜ֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08RN */
/* JADX INFO: loaded from: classes3.dex */
public final class C6789 implements InterfaceC24929 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f22618;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C20738 f22619;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f22620;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public volatile HandlerC0076 f22621;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C9025 f22622;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC24183 f22623;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C14245 f22624;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f22625;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4365 f22626;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f22627;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f22628;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public Handler f22629;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C14245 f22630;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f22631;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final UUID f22632;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Set f22633;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Set f22634;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int[] f22635;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0316 f22636;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC12248 f22637;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Looper f22638;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C8280 f22639;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f22640;

    public C6789(UUID uuid, C2764 c2764, C0316 c0316, HashMap map, boolean z, int[] iArr, boolean z2, C20773 c20773, long j) {
        uuid.getClass();
        C20782.m47564("Use C.CLEARKEY_UUID instead", !C19158.f61989.equals(uuid));
        this.f22632 = uuid;
        this.f22637 = c2764;
        this.f22636 = c0316;
        this.f22628 = map;
        this.f22618 = z;
        this.f22635 = iArr;
        this.f22631 = z2;
        this.f22626 = c20773;
        this.f22622 = new C9025();
        this.f22639 = new C8280(this);
        this.f22627 = new ArrayList();
        this.f22634 = Collections.newSetFromMap(new IdentityHashMap());
        this.f22633 = Collections.newSetFromMap(new IdentityHashMap());
        this.f22620 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18951(byte[] bArr) {
        C20782.m47568(this.f22627.isEmpty());
        this.f22640 = bArr;
    }

    @Override // l.InterfaceC24929
    /* JADX INFO: renamed from: ᩷ */
    public final void mo6290() {
        m18937(true);
        int i = this.f22625;
        this.f22625 = i + 1;
        if (i != 0) {
            return;
        }
        if (this.f22623 == null) {
            InterfaceC24183 interfaceC24183Mo9139 = this.f22637.mo9139(this.f22632);
            this.f22623 = interfaceC24183Mo9139;
            interfaceC24183Mo9139.mo38097(new C17975(this));
        } else {
            if (this.f22620 == -9223372036854775807L) {
                return;
            }
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.f22627;
                if (i2 >= arrayList.size()) {
                    return;
                }
                ((C14245) arrayList.get(i2)).mo27412((C12994) null);
                i2++;
            }
        }
    }

    @Override // l.InterfaceC24929
    /* JADX INFO: renamed from: ۙ */
    public final void mo6287() {
        m18937(true);
        int i = this.f22625 - 1;
        this.f22625 = i;
        if (i != 0) {
            return;
        }
        if (this.f22620 != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f22627);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C14245) arrayList.get(i2)).mo27415((C12994) null);
            }
        }
        AbstractC4516 it = AbstractC8639.copyOf((Collection) this.f22634).iterator();
        while (it.hasNext()) {
            ((C0822) it.next()).mo3292();
        }
        m18941();
    }

    @Override // l.InterfaceC24929
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC11502 mo6289(C12994 c12994, final C15648 c15648) {
        C20782.m47568(this.f22625 > 0);
        C20782.m47566(this.f22638);
        final C0822 c0822 = new C0822(this, c12994);
        Handler handler = this.f22629;
        handler.getClass();
        handler.post(new Runnable() { // from class: l.ۢ֨ۙ
            @Override // java.lang.Runnable
            public final void run() {
                C0822.m3291(c0822, c15648);
            }
        });
        return c0822;
    }

    @Override // l.InterfaceC24929
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC10756 mo6286(C12994 c12994, C15648 c15648) {
        m18937(false);
        C20782.m47568(this.f22625 > 0);
        C20782.m47566(this.f22638);
        return m18933(this.f22638, c12994, c15648, true);
    }

    @Override // l.InterfaceC24929
    /* JADX INFO: renamed from: ۙ */
    public final int mo6285(C15648 c15648) {
        m18937(false);
        InterfaceC24183 interfaceC24183 = this.f22623;
        interfaceC24183.getClass();
        int iMo38106 = interfaceC24183.mo38106();
        C22362 c22362 = c15648.f50838;
        if (c22362 == null) {
            int iM25260 = C9681.m25260(c15648.f50848);
            int i = 0;
            while (true) {
                int[] iArr = this.f22635;
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == iM25260) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return 0;
            }
        } else if (this.f22640 == null) {
            UUID uuid = this.f22632;
            if (m18931(c22362, uuid, true).isEmpty()) {
                if (c22362.f72390 == 1 && c22362.m50438(0).m15671(C19158.f61989)) {
                    C1896.m6517("DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = c22362.f72387;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return iMo38106;
    }

    @Override // l.InterfaceC24929
    /* JADX INFO: renamed from: ۙ */
    public final void mo6288(Looper looper, C20738 c20738) {
        synchronized (this) {
            Looper looper2 = this.f22638;
            if (looper2 == null) {
                this.f22638 = looper;
                this.f22629 = new Handler(looper);
            } else {
                C20782.m47568(looper2 == looper);
                this.f22629.getClass();
            }
        }
        this.f22619 = c20738;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC10756 m18933(Looper looper, C12994 c12994, C15648 c15648, boolean z) {
        ArrayList arrayListM18931;
        if (this.f22621 == null) {
            this.f22621 = new HandlerC0076(this, looper);
        }
        C22362 c22362 = c15648.f50838;
        int i = 0;
        C14245 c14245 = null;
        if (c22362 == null) {
            int iM25260 = C9681.m25260(c15648.f50848);
            InterfaceC24183 interfaceC24183 = this.f22623;
            interfaceC24183.getClass();
            if (interfaceC24183.mo38106() != 2 || !C4045.f13782) {
                int[] iArr = this.f22635;
                while (true) {
                    if (i >= iArr.length) {
                        i = -1;
                        break;
                    }
                    if (iArr[i] == iM25260) {
                        break;
                    }
                    i++;
                }
                if (i != -1 && interfaceC24183.mo38106() != 1) {
                    C14245 c14246 = this.f22630;
                    if (c14246 == null) {
                        C14245 c14245M18936 = m18936(AbstractC1928.of(), true, (C12994) null, z);
                        this.f22627.add(c14245M18936);
                        this.f22630 = c14245M18936;
                    } else {
                        c14246.mo27412((C12994) null);
                    }
                    return this.f22630;
                }
            }
            return null;
        }
        if (this.f22640 == null) {
            arrayListM18931 = m18931(c22362, this.f22632, false);
            if (arrayListM18931.isEmpty()) {
                C7534 c7534 = new C7534("Media does not support uuid: " + this.f22632);
                C1896.m6516("DRM error", c7534);
                if (c12994 != null) {
                    c12994.m32410(c7534);
                }
                return new C23437(new C21945(6003, c7534));
            }
        } else {
            arrayListM18931 = null;
        }
        if (!this.f22618) {
            c14245 = this.f22624;
        } else {
            for (C14245 c14247 : this.f22627) {
                if (C17359.equals(c14247.f45006, arrayListM18931)) {
                    c14245 = c14247;
                    break;
                }
            }
        }
        if (c14245 == null) {
            C14245 c14245M18937 = m18936((List) arrayListM18931, false, c12994, z);
            if (!this.f22618) {
                this.f22624 = c14245M18937;
            }
            this.f22627.add(c14245M18937);
            return c14245M18937;
        }
        c14245.mo27412(c12994);
        return c14245;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14245 m18936(List list, boolean z, C12994 c12994, boolean z2) {
        C14245 c14245M18935 = m18935(list, z, c12994);
        boolean zM18938 = m18938(c14245M18935);
        long j = this.f22620;
        Set set = this.f22633;
        if (zM18938 && !set.isEmpty()) {
            AbstractC4516 it = AbstractC8639.copyOf((Collection) set).iterator();
            while (it.hasNext()) {
                ((InterfaceC10756) it.next()).mo27415(null);
            }
            c14245M18935.mo27415(c12994);
            if (j != -9223372036854775807L) {
                c14245M18935.mo27415((C12994) null);
            }
            c14245M18935 = m18935(list, z, c12994);
        }
        if (m18938(c14245M18935) && z2) {
            Set set2 = this.f22634;
            if (!set2.isEmpty()) {
                AbstractC4516 it2 = AbstractC8639.copyOf((Collection) set2).iterator();
                while (it2.hasNext()) {
                    ((C0822) it2.next()).mo3292();
                }
                if (!set.isEmpty()) {
                    AbstractC4516 it3 = AbstractC8639.copyOf((Collection) set).iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC10756) it3.next()).mo27415(null);
                    }
                }
                c14245M18935.mo27415(c12994);
                if (j != -9223372036854775807L) {
                    c14245M18935.mo27415((C12994) null);
                }
                return m18935(list, z, c12994);
            }
        }
        return c14245M18935;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m18938(InterfaceC10756 interfaceC10756) {
        C14245 c14245 = (C14245) interfaceC10756;
        if (c14245.getState() != 1) {
            return false;
        }
        C21945 error = c14245.getError();
        error.getClass();
        Throwable cause = error.getCause();
        return (cause instanceof ResourceBusyException) || C17469.m40976(cause);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14245 m18935(List list, boolean z, C12994 c12994) {
        this.f22623.getClass();
        boolean z2 = this.f22631 | z;
        InterfaceC24183 interfaceC24183 = this.f22623;
        byte[] bArr = this.f22640;
        Looper looper = this.f22638;
        looper.getClass();
        C20738 c20738 = this.f22619;
        c20738.getClass();
        C14245 c14245 = new C14245(this.f22632, interfaceC24183, this.f22622, this.f22639, list, z2, z, bArr, this.f22628, this.f22636, looper, this.f22626, c20738);
        c14245.mo27412(c12994);
        if (this.f22620 != -9223372036854775807L) {
            c14245.mo27412((C12994) null);
        }
        return c14245;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m18941() {
        if (this.f22623 != null && this.f22625 == 0 && this.f22627.isEmpty() && this.f22634.isEmpty()) {
            InterfaceC24183 interfaceC24183 = this.f22623;
            interfaceC24183.getClass();
            interfaceC24183.mo38096();
            this.f22623 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18937(boolean z) {
        if (z && this.f22638 == null) {
            C1896.m6514("DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f22638;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            C1896.m6514("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f22638.getThread().getName(), new IllegalStateException());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m18931(C22362 c22362, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(c22362.f72390);
        for (int i = 0; i < c22362.f72390; i++) {
            C5208 c5208M50438 = c22362.m50438(i);
            if ((c5208M50438.m15671(uuid) || (C19158.f61986.equals(uuid) && c5208M50438.m15671(C19158.f61989))) && (c5208M50438.f18372 != null || z)) {
                arrayList.add(c5208M50438);
            }
        }
        return arrayList;
    }
}
