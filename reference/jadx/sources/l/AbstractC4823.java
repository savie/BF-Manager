package l;

/* JADX INFO: renamed from: l.ۙۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4823 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile C16471 f16868;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC4823 f16869;

    public abstract String getName();

    /* JADX INFO: renamed from: ۧ */
    public abstract InterfaceC21013 mo5000();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean mo14856() {
        return false;
    }

    /* JADX INFO: renamed from: ᩴ */
    public abstract String mo5002();

    /* JADX INFO: renamed from: ᩸ */
    public abstract C14034 mo5003();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void mo14857() {
    }

    public /* synthetic */ AbstractC4823(int i) {
        this();
    }

    public AbstractC4823() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14855(C16471 c16471) {
        C7301 builder;
        if (this.f16869 != null && c16471.equals(C16471.getDefaultInstance()) && !mo14856()) {
            this.f16868 = this.f16869.f16868;
            mo14857();
            return;
        }
        boolean z = false;
        boolean z2 = false;
        for (C7323 c7323 : c16471.m28526().keySet()) {
            int number = c7323.getNumber();
            C9780 c9780 = C21209.f67697;
            if (number == c9780.mo25504().getNumber() && c7323 != c9780.mo25504()) {
                z2 = true;
            }
        }
        if (!c16471.getUnknownFields().m21004().isEmpty() && c16471.getUnknownFields().m21007(C21209.f67697.mo25504().getNumber())) {
            z = true;
        }
        if (z2 || z) {
            C20485 c20485M46986 = C20485.m46986();
            c20485M46986.m46988(C21209.f67697);
            try {
                c16471 = C16471.m39060(c16471.toByteString(), c20485M46986);
            } catch (C20463 e) {
                throw new C18510(this, "Failed to parse features with Java feature extension registry.", e);
            }
        }
        AbstractC4823 abstractC4823 = this.f16869;
        if (abstractC4823 == null) {
            builder = C19739.m45482(mo5003().m34197()).toBuilder();
        } else {
            builder = abstractC4823.f16868.toBuilder();
        }
        builder.m19969(mo14853());
        builder.m19969(c16471);
        this.f16868 = C19739.m45483(builder.build());
        mo14857();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C16471 mo14853() {
        return C16471.getDefaultInstance();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16471 m14854() {
        if (this.f16868 == null && (mo5003().m34197() == EnumC5810.EDITION_PROTO2 || mo5003().m34197() == EnumC5810.EDITION_PROTO3)) {
            mo5003().m34194();
        }
        return this.f16868;
    }
}
