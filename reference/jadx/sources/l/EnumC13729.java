package l;

/* JADX INFO: renamed from: l.۬۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 49A2 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC13729 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ InterfaceC18995 f43583 = C10044.m25933(m33548());

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33546() {
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static InterfaceC18995 m33547() {
        return f43583;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33549(InterfaceC23955 interfaceC23955, Object obj, InterfaceC4825 interfaceC4825) {
        Object objMo3124;
        int i = C7018.f23148[ordinal()];
        if (i == 1) {
            try {
                C14117.m34278(C11471.f36082, C13808.m33718(C13808.m33719(interfaceC23955, obj, interfaceC4825)));
                return;
            } catch (Throwable th) {
                interfaceC4825.mo8188(C19676.m45347(th));
                throw th;
            }
        }
        if (i == 2) {
            C15243.m36590(interfaceC23955, "<this>");
            C15243.m36590(interfaceC4825, "completion");
            C13808.m33718(C13808.m33719(interfaceC23955, obj, interfaceC4825)).mo8188(C11471.f36082);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new C4760();
            }
            return;
        }
        C15243.m36590(interfaceC4825, "completion");
        try {
            InterfaceC11536 context = interfaceC4825.getContext();
            Object objM45511 = C19756.m45511(context, null);
            try {
                if (interfaceC23955 instanceof AbstractC20487) {
                    C15989.m38120(2, interfaceC23955);
                    objMo3124 = interfaceC23955.mo3124(obj, interfaceC4825);
                } else {
                    C15243.m36590(interfaceC23955, "<this>");
                    InterfaceC11536 context2 = interfaceC4825.getContext();
                    Object c23471 = context2 == C24963.f80840 ? new C23471(interfaceC4825) : new C3333(interfaceC4825, context2);
                    C15989.m38120(2, interfaceC23955);
                    objMo3124 = interfaceC23955.mo3124(obj, c23471);
                }
                C19756.m45510(context, objM45511);
                if (objMo3124 != EnumC16757.COROUTINE_SUSPENDED) {
                    interfaceC4825.mo8188(objMo3124);
                }
            } catch (Throwable th2) {
                C19756.m45510(context, objM45511);
                throw th2;
            }
        } catch (Throwable th3) {
            interfaceC4825.mo8188(C19676.m45347(th3));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33550() {
        return this == LAZY;
    }
}
