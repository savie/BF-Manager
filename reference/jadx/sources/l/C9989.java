package l;

import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۤ֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K7BU */
/* JADX INFO: loaded from: classes3.dex */
public final class C9989 extends AbstractC4674 implements Function {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f34119;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f34120;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f34121;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo33696andThen(Function function) {
        return C4277.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C4277.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        final C11545 c11545 = (C11545) obj;
        if (!c11545.m28814("local") || c11545.m28794()) {
            return Boolean.FALSE;
        }
        if (c11545.m28801().equals(this.f34119)) {
            if (this.f34120.size() != 1) {
                C15829.m37611(R.string.MT_Protector);
                return Boolean.FALSE;
            }
            final InterfaceC2557 interfaceC2557 = (InterfaceC2557) this.f34120.get(0);
            C7872.m20771(c11545.m28824(), interfaceC2557, c11545.m28798(), new InterfaceC18455() { // from class: l.᩵֫᩹
                @Override // l.InterfaceC18455
                /* JADX INFO: renamed from: ۙ */
                public final void mo42803(String str) {
                    InterfaceC2557 interfaceC2558 = interfaceC2557;
                    List listSingletonList = Collections.singletonList(interfaceC2558);
                    String name = interfaceC2558.getName();
                    String str2 = interfaceC2558.isDirectory() ? str : null;
                    C11545 c11546 = c11545;
                    C9989.m25248(listSingletonList, c11546, name, str2, c11546.m28798(), str).m25763();
                }
            });
            return Boolean.TRUE;
        }
        m25248(this.f34120, c11545, this.f34121, c11545.m28826(), c11545.m28798(), null).m25763();
        return Boolean.TRUE;
    }

    public C9989() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f34120 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        return c21422.m47974("local") && !c21422.m47977();
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        c21422.m47963("local");
        if (c21422.m47977()) {
            throw new IllegalStateException("Search results do not support single-window copy.");
        }
        this.f34120 = c21422.m47979();
        this.f34119 = c21422.m47966();
        this.f34121 = c21422.m47972();
        c21422.m47965().m28773(R.string.MT_Protector, this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10142 m25248(List list, C11545 c11545, String str, String str2, String str3, String str4) {
        int i = C20725.f67443;
        C10142 c10142 = new C10142(C8578.class);
        c10142.m25779(list);
        c10142.m25774(c11545);
        c10142.m25768("ARG_MSG_FROM", str);
        c10142.m25768("targetPath", str3);
        if (str2 != null) {
            c10142.m25768("ARG_MSG_TO", str2);
        }
        if (str4 != null) {
            c10142.m25768("replacedName", str4);
        }
        return c10142;
    }
}
