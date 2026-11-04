package l;

import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۠᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: L7ER */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8996 implements Supplier {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29305;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC1890 f29306;

    public /* synthetic */ C8996(AbstractC1890 abstractC1890, int i) {
        this.f29305 = i;
        this.f29306 = abstractC1890;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.f29305;
        AbstractC1890 abstractC1890 = this.f29306;
        switch (i) {
            case 0:
                C22180 c22180 = (C22180) abstractC1890;
                return String.format(" append_frame=%d offset=%d numlock=%s", Integer.valueOf(c22180.f71469), Integer.valueOf(c22180.f71468), C8499.m22814(c22180.f71467));
            default:
                final C4699 c4699 = (C4699) abstractC1890;
                return C8499.m22813(c4699.f6371.m5640(c4699.f16586, new Function() { // from class: l.۬۫᩺
                    @Override // java.util.function.Function
                    /* JADX INFO: renamed from: andThen */
                    public /* synthetic */ Function mo10608andThen(Function function) {
                        return C24247.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public /* synthetic */ Function compose(Function function) {
                        return C24247.$default$compose(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return "#" + c4699.f16586;
                    }
                }), "\"");
        }
    }
}
