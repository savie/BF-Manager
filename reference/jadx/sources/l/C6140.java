package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5E8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6140 extends AbstractC10172 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C14011 f20965;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12105[] f20966;

    public C6140(C14011 c14011, C10918 c10918) {
        try {
            super(4, (c14011.size() * 4) + 4);
            this.f20965 = c14011;
            this.f20966 = new C12105[c14011.size()];
            Iterator it = c14011.getAnnotations().iterator();
            int i = 0;
            while (it.hasNext()) {
                this.f20966[i] = new C12105(c10918, (C8791) it.next());
                i++;
            }
        } catch (NullPointerException unused) {
            throw new NullPointerException("list == null");
        }
    }

    public final int hashCode() {
        return this.f20965.hashCode();
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ۙ */
    public final int mo15563(AbstractC10172 abstractC10172) {
        return this.f20965.compareTo(((C6140) abstractC10172).f20965);
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final EnumC3461 mo1454() {
        return EnumC3461.TYPE_ANNOTATION_SET_ITEM;
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ۧ */
    public final String mo1456() {
        return this.f20965.toString();
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo1455(C10918 c10918) {
        C19123 c19123M27697 = c10918.m27697();
        C12105[] c12105Arr = this.f20966;
        int length = c12105Arr.length;
        for (int i = 0; i < length; i++) {
            c12105Arr[i] = (C12105) c19123M27697.m44247(c12105Arr[i]);
        }
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1458(C19123 c19123, int i) {
        C12105.m30277(this.f20966);
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1457(C10918 c10918, C15000 c15000) {
        boolean zM36116 = c15000.m36116();
        C12105[] c12105Arr = this.f20966;
        int length = c12105Arr.length;
        if (zM36116) {
            c15000.m36111(0, m26281() + " annotation set");
            c15000.m36111(4, "  size: ".concat(C5306.m15938(length)));
        }
        c15000.m36124(length);
        for (int i = 0; i < length; i++) {
            int iM26285 = c12105Arr[i].m26285();
            if (zM36116) {
                c15000.m36111(4, "  entries[" + Integer.toHexString(i) + "]: " + C5306.m15938(iM26285));
                c12105Arr[i].m30278(c15000);
            }
            c15000.m36124(iM26285);
        }
    }
}
