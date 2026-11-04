package l;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: D1KT */
/* JADX INFO: loaded from: classes.dex */
public final class C21655 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public WeakReference f69125;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f69126;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f69127;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f69128;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f69129 = new ArrayList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C21655 f69130;

    public C21655(C19782 c19782, C21655 c21655) {
        this.f69127 = c19782.m45562();
        this.f69128 = c19782.m45560();
        this.f69130 = c21655;
        m49191(c21655 == null ? 0 : c21655.m49188() + 1);
        m49194(false);
    }

    public C21655(C22020 c22020, C21655 c21655) {
        this.f69127 = c22020.m49803();
        this.f69128 = c22020.m49804();
        this.f69130 = c21655;
        m49191(c21655 == null ? 0 : c21655.m49188() + 1);
        m49194(true);
    }

    public C21655(int i, C21655 c21655) {
        this.f69130 = c21655;
        m49191(c21655 == null ? 0 : c21655.m49188() + 1);
        m49194(true);
        this.f69126 |= 2;
        m49179(i);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m49186() {
        return (this.f69126 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m49194(boolean z) {
        if (z) {
            this.f69126 |= 1;
        } else {
            this.f69126 &= -2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m49177() {
        return (this.f69126 & 2) != 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m49187() {
        return (this.f69126 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m49184(boolean z) {
        if (z) {
            this.f69126 |= 4;
        } else {
            this.f69126 &= -5;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m49185() {
        return (this.f69126 & 8) != 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m49189(boolean z) {
        if (z) {
            this.f69126 |= 8;
        } else {
            this.f69126 &= -9;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m49183() {
        return (this.f69126 >>> 4) & 3;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m49176(int i) {
        if ((i & 3) != i) {
            throw new RuntimeException();
        }
        this.f69126 = (i << 4) | (this.f69126 & (-49));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m49188() {
        return (this.f69126 >>> 6) & 255;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m49191(int i) {
        if ((i & 255) != i) {
            throw new RuntimeException();
        }
        this.f69126 = (i << 6) | (this.f69126 & (-16321));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m49193() {
        return (this.f69126 >>> 16) & 65535;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49179(int i) {
        if ((i & 65535) != i) {
            throw new RuntimeException();
        }
        this.f69126 = (i << 16) | (65535 & this.f69126);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m49195() {
        WeakReference weakReference = this.f69125;
        C14240 c14240 = weakReference == null ? null : (C14240) weakReference.get();
        if (c14240 != null) {
            c14240.m34563(m49183());
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m49182() {
        if (m49186()) {
            return m49183() == 2;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49178() {
        m49176(0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m49190() {
        m49176(2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m49192(boolean z) {
        if (z == m49182()) {
            return;
        }
        m49176(z ? 2 : 0);
        C21655 c21655 = this.f69130;
        if (c21655 != null) {
            c21655.m49181(true);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49181(boolean z) {
        C21655 c21655;
        if (m49186()) {
            throw new RuntimeException();
        }
        ArrayList arrayList = this.f69129;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            int iM49183 = ((C21655) it.next()).m49183();
            if (iM49183 == 1) {
                i = -1;
                break;
            } else if (iM49183 == 2) {
                i++;
            }
        }
        if (i > 0 && i == arrayList.size()) {
            m49176(2);
        } else if (i == 0) {
            m49176(0);
        } else {
            m49176(1);
        }
        WeakReference weakReference = this.f69125;
        C14240 c14240 = weakReference == null ? null : (C14240) weakReference.get();
        if (c14240 != null) {
            c14240.m34563(m49183());
        }
        if (!z || (c21655 = this.f69130) == null) {
            return;
        }
        c21655.m49181(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49180(C14240 c14240) {
        C21655 c21655 = (C21655) c14240.getTag();
        if (c21655 != null) {
            WeakReference weakReference = c21655.f69125;
            if ((weakReference == null ? null : (C14240) weakReference.get()) == c14240) {
                c21655.f69125 = null;
            }
        }
        c14240.m34563(m49183());
        this.f69125 = new WeakReference(c14240);
        c14240.setTag(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C21655.class == obj.getClass()) {
            C21655 c21655 = (C21655) obj;
            if (C17359.equals(this.f69128, c21655.f69128) && m49186() == c21655.m49186() && m49177() == c21655.m49177()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f69128.hashCode() * 31) + (this.f69126 & 3);
    }
}
