package l;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗ᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: D1KT */
/* JADX INFO: loaded from: classes2.dex */
public final class C3534 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C3534 f13020;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public WeakReference f13021;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f13022;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f13023;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f13024 = new ArrayList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f13025;

    public C3534(C5693 c5693, C3534 c3534) {
        this.f13025 = c5693.m15697();
        this.f13022 = c5693.m15701();
        this.f13020 = c3534;
        m10411(c3534 == null ? 0 : c3534.m10404() + 1);
        m10398(false);
    }

    public C3534(C14161 c14161, C3534 c3534) {
        this.f13025 = c14161.m34232();
        this.f13022 = c14161.m34233();
        this.f13020 = c3534;
        m10411(c3534 == null ? 0 : c3534.m10404() + 1);
        m10398(true);
    }

    public C3534(int i, C3534 c3534) {
        this.f13020 = c3534;
        m10411(c3534 == null ? 0 : c3534.m10404() + 1);
        m10398(true);
        this.f13023 |= 2;
        m10401(i);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m10396() {
        return (this.f13023 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m10398(boolean z) {
        if (z) {
            this.f13023 |= 1;
        } else {
            this.f13023 &= -2;
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m10399() {
        return (this.f13023 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m10413() {
        return (this.f13023 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m10408(boolean z) {
        if (z) {
            this.f13023 |= 4;
        } else {
            this.f13023 &= -5;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m10406() {
        return (this.f13023 & 8) != 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m10405(boolean z) {
        if (z) {
            this.f13023 |= 8;
        } else {
            this.f13023 &= -9;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m10407() {
        return (this.f13023 >>> 4) & 3;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m10395(int i) {
        if ((i & 3) != i) {
            throw new RuntimeException();
        }
        this.f13023 = (i << 4) | (this.f13023 & (-49));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m10404() {
        return (this.f13023 >>> 6) & 255;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m10411(int i) {
        if ((i & 255) != i) {
            throw new RuntimeException();
        }
        this.f13023 = (i << 6) | (this.f13023 & (-16321));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m10397() {
        return (this.f13023 >>> 16) & 65535;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10401(int i) {
        if ((i & 65535) != i) {
            throw new RuntimeException();
        }
        this.f13023 = (i << 16) | (65535 & this.f13023);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m10414() {
        WeakReference weakReference = this.f13021;
        C24018 c24018 = weakReference == null ? null : (C24018) weakReference.get();
        if (c24018 != null) {
            c24018.m52854(m10407());
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m10409() {
        if (m10396()) {
            return m10407() == 2;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10400() {
        m10395(0);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m10410() {
        m10395(2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m10412(boolean z) {
        if (z == m10409()) {
            return;
        }
        m10395(z ? 2 : 0);
        C3534 c3534 = this.f13020;
        if (c3534 != null) {
            c3534.m10403(true);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10403(boolean z) {
        C3534 c3534;
        if (m10396()) {
            throw new RuntimeException();
        }
        ArrayList arrayList = this.f13024;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            int iM10407 = ((C3534) it.next()).m10407();
            if (iM10407 == 1) {
                i = -1;
                break;
            } else if (iM10407 == 2) {
                i++;
            }
        }
        if (i > 0 && i == arrayList.size()) {
            m10395(2);
        } else if (i == 0) {
            m10395(0);
        } else {
            m10395(1);
        }
        WeakReference weakReference = this.f13021;
        C24018 c24018 = weakReference == null ? null : (C24018) weakReference.get();
        if (c24018 != null) {
            c24018.m52854(m10407());
        }
        if (!z || (c3534 = this.f13020) == null) {
            return;
        }
        c3534.m10403(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10402(C24018 c24018) {
        C3534 c3534 = (C3534) c24018.getTag();
        if (c3534 != null) {
            WeakReference weakReference = c3534.f13021;
            if ((weakReference == null ? null : (C24018) weakReference.get()) == c24018) {
                c3534.f13021 = null;
            }
        }
        c24018.m52854(m10407());
        this.f13021 = new WeakReference(c24018);
        c24018.setTag(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3534.class == obj.getClass()) {
            C3534 c3534 = (C3534) obj;
            if (C13638.equals(this.f13022, c3534.f13022) && m10396() == c3534.m10396() && m10399() == c3534.m10399()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f13022.hashCode() * 31) + (this.f13023 & 3);
    }
}
