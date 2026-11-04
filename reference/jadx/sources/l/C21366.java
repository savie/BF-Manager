package l;

/* JADX INFO: renamed from: l.᩶ܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public final class C21366 implements InterfaceC16934 {

    /* JADX INFO: renamed from: ܽܶܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f68051;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ActivityC18143 f68052;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7941 f68053;

    static {
        ApplicationC23172.m52091(153);
        f68051 = new short[]{6605, -21316, -21331, -21333, -21335, -21375, -21341, -21336, -21335, -21329, -21319, -21314, -21314, -21335, -21342, -21320, -21348, -21331, -21333, -21335, -21371, -21342, -21336, -21335, -21324, -21279};
    }

    @Override // l.InterfaceC16934
    /* JADX INFO: renamed from: ᩷ */
    public native void mo39911();

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 22061. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48604(java.lang.CharSequence r38, java.lang.String r39, l.C23056 r40) {
        /*
            Method dump skipped, instruction units count: 2206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21366.m48604(java.lang.CharSequence, java.lang.String, l.᩸᩶᩸):void");
    }

    public C21366(C7941 c7941, ActivityC18143 activityC18143) {
        this.f68053 = c7941;
        this.f68052 = activityC18143;
        if (c7941.f23989 == null) {
            c7941.f23989 = (C1229) new C16196(activityC18143).m38422(C1229.class);
        }
        if (c7941.f23988 == null) {
            c7941.f23988 = (C12318) new C16196(activityC18143).m38422(C12318.class);
        }
    }

    @Override // l.InterfaceC16934
    public final String getTitle() {
        return this.f68053.m21639();
    }

    @Override // l.InterfaceC16934
    /* JADX INFO: renamed from: ۙ */
    public final void mo39910(Exception exc) {
        ActivityC18143 activityC18143 = this.f68052;
        C7941 c7941 = this.f68053;
        c7941.m21528(exc, activityC18143, c7941.m19934());
    }
}
