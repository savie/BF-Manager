package l;

import bin.mt.plus.R;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸ۡۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: W2ZV */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22689 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f73668;

    public /* synthetic */ C22689(int i) {
        this.f73668 = i;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f73668) {
            case 0:
                ((C24927) obj).m55547();
                break;
            case 1:
                ActivityC0848 activityC0848 = (ActivityC0848) obj;
                activityC0848.setTitle(R.string.MT_Protector);
                activityC0848.m3428((CharSequence) null);
                break;
            case 2:
                C1184 c1184 = (C1184) obj;
                c1184.m4359().mo1130(c1184.getType());
                break;
            default:
                C25406.m56772((EnumC11979) obj);
                break;
        }
    }
}
