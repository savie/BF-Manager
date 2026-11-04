package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۧܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 3IUS */
/* JADX INFO: loaded from: classes4.dex */
public final class C11733 implements InterfaceC10161 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6514 f37959;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12479 f37960;

    static {
        C16980.m40037(C11733.class);
    }

    public C11733(C12479 c12479, C6514 c6514) {
        this.f37960 = c12479;
        this.f37959 = c6514;
    }

    @Override // l.InterfaceC10161
    public final C11733 copy() {
        return new C11733(this.f37960.m30987(), this.f37959.m18380());
    }

    @Override // l.InterfaceC10161
    public final String getType() {
        C12479 c12479 = this.f37960;
        c12479.m30991(0);
        String strM30997 = c12479.m30997(c12479.m30990());
        if (strM30997 != null) {
            return strM30997;
        }
        throw new NullPointerException("Unknown class type");
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ᩷ */
    public final int mo26275() {
        C12479 c12479 = this.f37960;
        c12479.m30991(4);
        return c12479.m30990();
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۙ */
    public final String mo26272() {
        C12479 c12479 = this.f37960;
        c12479.m30991(8);
        return c12479.m30997(c12479.m30990());
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ᩸ */
    public final List mo26276() {
        C12479 c12479 = this.f37960;
        c12479.m30991(12);
        int iM30990 = c12479.m30990();
        if (iM30990 == 0) {
            return Collections.EMPTY_LIST;
        }
        c12479.m30988(iM30990);
        return c12479.m31001();
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۤ */
    public final String mo26274() {
        return this.f37960.m31009().m7727();
    }

    @Override // l.InterfaceC10161
    /* JADX INFO: renamed from: ۙ */
    public final void mo26273(C9613 c9613, C9613 c9614) {
        C12479 c12479 = this.f37960;
        c12479.m30991(24);
        int iM30990 = c12479.m30990();
        if (iM30990 == 0) {
            return;
        }
        C12479 c12479M31006 = c12479.m31006(iM30990);
        int iM50647 = C22463.m50647(c12479M31006);
        int iM50648 = C22463.m50647(c12479M31006);
        int iM50649 = C22463.m50647(c12479M31006);
        int iM506410 = C22463.m50647(c12479M31006);
        c9613.m25101(iM50647 + iM50648);
        c9614.m25101(iM50649 + iM506410);
        c12479.m30991(20);
        int iM30991 = c12479.m30990();
        C6514 c6514 = this.f37959;
        c6514.m18382(iM30991);
        Map mapM18381 = c6514.m18381();
        C16954 c16954 = new C16954(c6514);
        c16954.m39935(getType());
        m29466(c9613, c12479M31006, c16954, iM50647, mapM18381, true);
        m29466(c9613, c12479M31006, c16954, iM50648, mapM18381, false);
        C23668 c23668 = new C23668(c6514);
        c23668.m52906(new C20684());
        Map mapM18383 = c6514.m18383();
        Map mapM18386 = c6514.m18386();
        m29467(c9614, c12479M31006, c23668, iM50649, mapM18383, mapM18386);
        m29467(c9614, c12479M31006, c23668, iM506410, mapM18383, mapM18386);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29466(C9613 c9613, C12479 c12479, C16954 c16954, int i, Map map, boolean z) {
        List listM18378;
        C12479 c124710 = this.f37960;
        if (z) {
            C12479 c12479M30987 = c12479.m30987();
            c124710.m30991(28);
            int iM30990 = c124710.m30990();
            if (iM30990 == 0) {
                listM18378 = Collections.EMPTY_LIST;
            } else {
                c12479M30987.m30988(iM30990);
                listM18378 = this.f37959.m18378(c12479M30987);
            }
        } else {
            listM18378 = null;
        }
        int i2 = 0;
        int iM50647 = 0;
        while (i2 < i) {
            iM50647 += C22463.m50647(c12479);
            int iM50648 = C22463.m50647(c12479);
            c124710.m30985(c16954, iM50647);
            c16954.m39930(iM50648);
            Integer num = (Integer) map.get(Integer.valueOf(iM50647));
            c16954.m39934(num != null ? num.intValue() : 0);
            c16954.m39932((!z || i2 >= listM18378.size()) ? null : (C15580) listM18378.get(i2));
            c9613.accept(c16954);
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29467(C9613 c9613, C12479 c12479, C23668 c23668, int i, Map map, Map map2) {
        C12479 c124710 = this.f37960;
        C25160 c25160 = new C25160(c124710.m30987());
        int iM50647 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM50647 += C22463.m50647(c12479);
            int iM50648 = C22463.m50647(c12479);
            int iM50649 = C22463.m50647(c12479);
            C20684 c20684M52904 = c23668.m52904();
            c20684M52904.m47323();
            c124710.m30989(iM50647, c20684M52904);
            c23668.m52905(iM50648);
            if (iM50649 == 0) {
                c23668.m52907((C25160) null);
            } else {
                c25160.m56074(iM50647);
                c25160.m56079(iM50649);
                c23668.m52907(c25160);
            }
            Integer num = (Integer) map.get(Integer.valueOf(iM50647));
            c23668.m52909(num != null ? num.intValue() : 0);
            Integer num2 = (Integer) map2.get(Integer.valueOf(iM50647));
            c23668.m52908(num2 != null ? num2.intValue() : 0);
            c9613.accept(c23668);
        }
    }

    @Override // l.InterfaceC10161
    public final ArrayList getAttributes() {
        ArrayList arrayList = new ArrayList();
        C12479 c12479 = this.f37960;
        c12479.m30991(16);
        String strM30998 = c12479.m30998(c12479.m30990());
        if (strM30998 != null && !strM30998.isEmpty()) {
            arrayList.add(new C21548(strM30998));
        }
        String type = getType();
        c12479.m30991(20);
        int iM30990 = c12479.m30990();
        C6514 c6514 = this.f37959;
        c6514.m18382(iM30990);
        C2039.m7012(type, arrayList, c6514.m18384());
        return arrayList;
    }

    public final String toString() {
        return getType();
    }
}
