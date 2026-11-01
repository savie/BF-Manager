package l;

import bin.mt.plus.R;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21950 implements Consumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f71215;

    public /* synthetic */ C21950(int i) {
        this.f71215 = i;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f71215) {
            case 0:
                ((ActivityC5677) obj).m15664(R.layout.MT_Protector);
                break;
            case 1:
                AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) obj;
                C13465.m32966(abstractActivityC12483, "activity");
                int i = C14015.f46057;
                C17485 c17485 = new C17485(abstractActivityC12483, R.string.MT_Protector);
                c17485.m40704();
                new Thread(new RunnableC17294(abstractActivityC12483, new C18932(c17485))).start();
                break;
            default:
                C13612.m33288((EnumC4438) obj);
                break;
        }
    }
}
