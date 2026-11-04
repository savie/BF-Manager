package l;

import android.content.Context;
import android.util.AttributeSet;
import bin.mt.plus.R;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۤ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49SX */
/* JADX INFO: loaded from: classes4.dex */
public class C10870 extends AbstractC11813 {
    public C10870(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m12575((InterfaceC24044) new C4092(this));
    }

    public C10870(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m12575((InterfaceC24044) new C4092(this));
    }

    public C10870(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12575((InterfaceC24044) new C4092(this));
    }

    public C10870(Context context) {
        super(context);
        m12575((InterfaceC24044) new C4092(this));
    }

    @Override // l.AbstractC11813
    /* JADX INFO: renamed from: ۙ */
    public final void mo2388(AbstractActivityC17204 abstractActivityC17204) {
        m27609(abstractActivityC17204, m12578(), m29658().getInt(m12557(), 10), new InterfaceC14984() { // from class: l.ۙ۫ۧ
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                C10870.m27608(this.f17136, i);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final /* bridge */ /* synthetic */ void n(Object obj) {
                mo15049((Integer) obj);
            }

            @Override // l.InterfaceC14984
            /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ void mo15049(Integer num) {
                C19460.m45001((InterfaceC14984) this, num);
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return C19460.m45000((InterfaceC14984) this, intConsumer);
            }

            public final Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27608(C10870 c10870, int i) {
        c10870.m29658().edit().putInt(c10870.m12557(), i).apply();
        c10870.mo7306();
        C2166.m7449();
        C23026.m51926();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27609(AbstractActivityC17204 abstractActivityC17204, CharSequence charSequence, int i, InterfaceC14984 interfaceC14984) {
        C16434 c16434 = new C16434(abstractActivityC17204, null);
        c16434.setMax(25);
        c16434.setPadding(c16434.getPaddingLeft(), C6907.m19160(20.0f) + c16434.getPaddingTop(), c16434.getPaddingRight(), c16434.getPaddingBottom());
        c16434.setProgress(i - 5);
        String str = ((Object) charSequence) + " (";
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        StringBuilder sbM27333 = C10732.m27333(str);
        sbM27333.append(c16434.getProgress() + 5);
        sbM27333.append("s)");
        c2361BuildDialog.m8024(sbM27333.toString());
        c2361BuildDialog.m8005(c16434);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c16434.setOnSeekBarChangeListener(new C22059(c2361BuildDialog.m8016(), str, interfaceC14984));
    }
}
