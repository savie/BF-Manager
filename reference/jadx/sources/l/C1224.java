package l;

import java.util.ArrayList;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.֨ܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BDT */
/* JADX INFO: loaded from: classes3.dex */
public final class C1224 implements InterfaceC6052, Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5897 f4467;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C18181 f4468;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4468.compareTo(((C1224) obj).f4468);
    }

    public C1224(C18181 c18181, C4538 c4538, C10918 c10918) {
        this.f4468 = c18181;
        int size = c4538.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C24040(new C6140(c4538.m31616get(i), c10918)));
        }
        this.f4467 = new C5897(EnumC3461.TYPE_ANNOTATION_SET_REF_LIST, arrayList);
    }

    public final int hashCode() {
        return this.f4468.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1224)) {
            return false;
        }
        return this.f4468.equals(((C1224) obj).f4468);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4442(C10918 c10918) {
        C18377 c18377M27707 = c10918.m27707();
        C19123 c19123M27703 = c10918.m27703();
        c18377M27707.m42875(this.f4468);
        c19123M27703.m44244((AbstractC10172) this.f4467);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4443(C10918 c10918, C15000 c15000) {
        C18377 c18377M27707 = c10918.m27707();
        C18181 c18181 = this.f4468;
        int iM42872 = c18377M27707.m42872((AbstractC22657) c18181);
        int iM26285 = this.f4467.m26285();
        if (c15000.m36116()) {
            c15000.m36111(0, ASN1Dump.TAB + c18181.mo1843());
            c15000.m36111(4, "      method_idx:      ".concat(C5306.m15938(iM42872)));
            c15000.m36111(4, "      annotations_off: ".concat(C5306.m15938(iM26285)));
        }
        c15000.m36124(iM42872);
        c15000.m36124(iM26285);
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4468.mo1843());
        sb.append(": ");
        boolean z = true;
        for (C24040 c24040 : (ArrayList) this.f4467.m17118()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c24040.mo1456());
        }
        return sb.toString();
    }
}
