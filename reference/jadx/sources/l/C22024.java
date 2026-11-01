package l;

import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩹ۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: V7BK */
/* JADX INFO: loaded from: classes.dex */
public final class C22024 extends AbstractC4674 implements Function {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f71389;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f71390;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f71391;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f71392;

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
        C11545 c11545 = (C11545) obj;
        if (!c11545.m28814("local") || c11545.m28794()) {
            return Boolean.FALSE;
        }
        if (c11545.m28801().equals(this.f71390)) {
            C15829.m37611(R.string.MT_Protector);
            return Boolean.FALSE;
        }
        AbstractC20745 abstractC20745M15313 = C5553.m15313(c11545.m28799(), new String[0]);
        for (InterfaceC2557 interfaceC2557 : this.f71391) {
            if (interfaceC2557.isDirectory() && abstractC20745M15313.m46705(interfaceC2557.mo7989())) {
                c11545.m28824().m31000(C16737.m39264(R.string.MT_Protector, interfaceC2557.getName()), false);
                return Boolean.FALSE;
            }
        }
        int i = C20725.f67443;
        C10142 c10142 = new C10142(C5090.class);
        c10142.m25772(this.f71391);
        c10142.m25774(c11545);
        c10142.m25768("ARG_MSG_FROM", this.f71392);
        c10142.m25768("ARG_MSG_TO", c11545.m28826());
        c10142.m25768("sourcePath", this.f71389);
        c10142.m25768("targetPath", c11545.m28799());
        c10142.m25763();
        return Boolean.TRUE;
    }

    public C22024() {
        super(android.R.string.cut, R.drawable.MT_Protector);
        this.f71391 = Collections.EMPTY_LIST;
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
            throw new IllegalStateException("Search results do not support single-window move.");
        }
        this.f71391 = c21422.m47979();
        this.f71390 = c21422.m47966();
        this.f71389 = c21422.m47961();
        this.f71392 = c21422.m47972();
        c21422.m47965().m28773(R.string.MT_Protector, this);
    }
}
