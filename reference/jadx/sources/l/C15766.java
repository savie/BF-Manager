package l;

import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺۜۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: EB82 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15766 implements Consumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f51073;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f51074;

    public /* synthetic */ C15766(int i, Object obj) {
        this.f51073 = i;
        this.f51074 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f51073) {
            case 0:
                StringBuilder sb = (StringBuilder) this.f51074;
                Map.Entry entry = (Map.Entry) obj;
                sb.append((String) entry.getValue());
                sb.append(" -> ");
                sb.append((String) entry.getKey());
                sb.append(":\n");
                break;
            default:
                C8551 c8551 = (C8551) this.f51074;
                c8551.getClass();
                c8551.m22309(((C3992) obj).f14833);
                break;
        }
    }
}
