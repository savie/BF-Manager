package l;

import android.os.Bundle;
import android.view.View;
import bin.mt.plus.R;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1E0 */
/* JADX INFO: loaded from: classes3.dex */
public class C2776 extends AbstractC9051 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f9154;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C24720 f9155;

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9149(byte[] bArr) {
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۫ */
    public final String mo1443() {
        return null;
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ܳ */
    public final int mo1444() {
        return R.drawable.MT_Protector;
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ᩵ */
    public final boolean mo1446() {
        return false;
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo9150() {
        return false;
    }

    public C2776() {
        super(R.layout.MT_Protector);
        this.f9155 = C24720.m55197();
        this.f9154 = true;
        m24174("000000-0000-0000-0000-000000000002");
    }

    @Override // l.ComponentCallbacksC11612
    public final void onViewCreated(View view, Bundle bundle) {
        view.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۢܺۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C2776.m9147(this.f32695);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9147(C2776 c2776) {
        if (c2776.f9155.m55199()) {
            c2776.m24163(new C18192(1));
        }
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۚ */
    public final String mo1440() {
        return C21576.m49088(R.string.MT_Protector);
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ܺ */
    public final String mo1445() {
        return C21576.m49088(R.string.MT_Protector);
    }

    @Override // l.AbstractC9051, l.ComponentCallbacksC11612
    public final void onResume() {
        View view;
        super.onResume();
        m24163(new C22689(1));
        if (this.f9154 && this.f9155.m55199() && (view = getView()) != null) {
            view.post(new Runnable() { // from class: l.֨ܺۧ
                @Override // java.lang.Runnable
                public final void run() {
                    final C2776 c2776 = this.f4598;
                    c2776.m24163(new Consumer() { // from class: l.ۡܺۧ
                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void n(Object obj) {
                            C2776.m9148(c2776, (ActivityC0848) obj);
                        }

                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C12312.$default$andThen(this, consumer);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9148(C2776 c2776, ActivityC0848 activityC0848) {
        if (c2776.f9154 && activityC0848.m3449()) {
            c2776.f9154 = false;
        }
    }
}
