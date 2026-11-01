package l;

import android.content.Context;
import android.util.AttributeSet;
import bin.mt.plus.R;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۬ܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49SX */
/* JADX INFO: loaded from: classes4.dex */
public class C13251 extends AbstractC18168 {
    public C13251(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m13145((InterfaceC3485) new C20206(3, this));
    }

    public C13251(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m13145((InterfaceC3485) new C20206(3, this));
    }

    public C13251(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13145((InterfaceC3485) new C20206(3, this));
    }

    public C13251(Context context) {
        super(context);
        m13145((InterfaceC3485) new C20206(3, this));
    }

    @Override // l.AbstractC18168
    /* JADX INFO: renamed from: ۙ */
    public final void mo950(AbstractActivityC12483 abstractActivityC12483) {
        m32730(abstractActivityC12483, m13158(), m42292().getInt(m13157(), 10), new InterfaceC23537() { // from class: l.᩹ܿۘ
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                C13251.m32731(this.f73181, i);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final /* bridge */ /* synthetic */ void n(Object obj) {
                mo1000((Integer) obj);
            }

            @Override // l.InterfaceC23537
            /* JADX INFO: renamed from: ۨ */
            public final /* synthetic */ void mo1000(Integer num) {
                C10837.m27159((InterfaceC23537) this, num);
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return C10837.m27158((InterfaceC23537) this, intConsumer);
            }

            public final Consumer andThen(Consumer consumer) {
                return C1455.$default$andThen(this, consumer);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m32731(C13251 c13251, int i) {
        c13251.m42292().edit().putInt(c13251.m13157(), i).apply();
        c13251.mo8453();
        C18225.m42374();
        C2539.m7921();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32730(AbstractActivityC12483 abstractActivityC12483, CharSequence charSequence, int i, InterfaceC23537 interfaceC23537) {
        C15532 c15532 = new C15532(abstractActivityC12483, null);
        c15532.setMax(25);
        c15532.setPadding(c15532.getPaddingLeft(), C13932.m33769(20.0f) + c15532.getPaddingTop(), c15532.getPaddingRight(), c15532.getPaddingBottom());
        c15532.setProgress(i - 5);
        String str = ((Object) charSequence) + " (";
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        StringBuilder sbM23356 = C9023.m23356(str);
        sbM23356.append(c15532.getProgress() + 5);
        sbM23356.append("s)");
        c8067BuildDialog.m21277(sbM23356.toString());
        c8067BuildDialog.m21258(c15532);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c15532.setOnSeekBarChangeListener(new C1255(c8067BuildDialog.m21269(), str, interfaceC23537));
    }
}
