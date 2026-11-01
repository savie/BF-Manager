package l;

/* JADX INFO: renamed from: l.᩷ܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes5.dex */
public final class C20998 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC16060 f68370;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f68371;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20998(ViewOnClickListenerC16060 viewOnClickListenerC16060, AbstractActivityC12483 abstractActivityC12483, AbstractC20745 abstractC20745) {
        super(abstractActivityC12483, -1);
        this.f68370 = viewOnClickListenerC16060;
        this.f68371 = abstractC20745;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        ActivityC20293 activityC20293 = this.f68370.f51955;
        AbstractC20745 abstractC20745 = this.f68371;
        String strM46718 = abstractC20745.m46718();
        String strTrim = m40352().trim();
        if (strTrim.isEmpty() || strTrim.equals(strM46718)) {
            m40364();
            return;
        }
        StringBuilder sbM23356 = C9023.m23356(strTrim);
        sbM23356.append(abstractC20745.m46726());
        AbstractC20745 abstractC20745M46706 = abstractC20745.m46706(sbM23356.toString());
        String strM15308 = C5553.m15308(abstractC20745, abstractC20745M46706);
        if (strM15308 != null) {
            m40347(strM15308);
            return;
        }
        C21094.m47530();
        C23186.m51173();
        m40364();
        activityC20293.f65759 = abstractC20745M46706.getName();
        ActivityC20293.m45803(activityC20293);
    }
}
