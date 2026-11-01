package l;

/* JADX INFO: renamed from: l.ۤ᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10569 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile C23539 f36172;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC10569 f36173;

    public abstract String getName();

    /* JADX INFO: renamed from: ֨ */
    public boolean mo23480() {
        return false;
    }

    /* JADX INFO: renamed from: ۚ */
    public abstract String mo8523();

    /* JADX INFO: renamed from: ۜ */
    public abstract InterfaceC1332 mo8524();

    /* JADX INFO: renamed from: ܰ */
    public abstract C9158 mo8528();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public void mo26728() {
    }

    public /* synthetic */ AbstractC10569(int i) {
        this();
    }

    public AbstractC10569() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26727(C23539 c23539) {
        C19305 builder;
        if (this.f36173 != null && c23539.equals(C23539.getDefaultInstance()) && !mo23480()) {
            this.f36172 = this.f36173.f36172;
            mo26728();
            return;
        }
        boolean z = false;
        boolean z2 = false;
        for (C19741 c19741 : c23539.m17283().keySet()) {
            int number = c19741.getNumber();
            C15424 c15424 = C1001.f4676;
            if (number == c15424.mo36901().getNumber() && c19741 != c15424.mo36901()) {
                z2 = true;
            }
        }
        if (!c23539.getUnknownFields().m18142().isEmpty() && c23539.getUnknownFields().m18145(C1001.f4676.mo36901().getNumber())) {
            z = true;
        }
        if (z2 || z) {
            C4818 c4818M13398 = C4818.m13398();
            c4818M13398.m13400(C1001.f4676);
            try {
                c23539 = C23539.m51865(c23539.toByteString(), c4818M13398);
            } catch (C4529 e) {
                throw new C13391(this, "Failed to parse features with Java feature extension registry.", e);
            }
        }
        AbstractC10569 abstractC10569 = this.f36173;
        if (abstractC10569 == null) {
            builder = C20446.m46245(mo8528().m23487()).toBuilder();
        } else {
            builder = abstractC10569.f36172.toBuilder();
        }
        builder.m44291(mo23481());
        builder.m44291(c23539);
        this.f36172 = C20446.m46246(builder.build());
        mo26728();
    }

    /* JADX INFO: renamed from: ۘ */
    public C23539 mo23481() {
        return C23539.getDefaultInstance();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23539 m26726() {
        if (this.f36172 == null && (mo8528().m23487() == EnumC12167.EDITION_PROTO2 || mo8528().m23487() == EnumC12167.EDITION_PROTO3)) {
            mo8528().m23486();
        }
        return this.f36172;
    }
}
