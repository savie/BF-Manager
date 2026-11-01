package l;

import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴ᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8OV */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19084 implements InterfaceC7359, InterfaceC15954, InterfaceC4509 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f61669;

    public /* synthetic */ C19084(int i) {
        this.f61669 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m43861(ArrayList arrayList, int i) {
        return arrayList.get(arrayList.size() - i);
    }

    @Override // l.InterfaceC15954
    public Object apply(Object obj) {
        Long l2 = (Long) obj;
        if (l2.longValue() >= 0) {
            return EnumC9578.COMPACTED;
        }
        if (l2.longValue() == -2) {
            return EnumC9578.LOW_GAIN;
        }
        return l2.longValue() == -3 ? EnumC9578.BUDGET_EXHAUSTED : EnumC9578.SKIPPED;
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        InterfaceC10430 interfaceC10430 = (InterfaceC10430) obj;
        switch (this.f61669) {
            case 4:
                interfaceC10430.getClass();
                break;
            default:
                interfaceC10430.getClass();
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43862(InterfaceC19790 interfaceC19790, InterfaceC19790 interfaceC19791) {
        if (interfaceC19790 == interfaceC19791) {
            return;
        }
        if (interfaceC19791 != null) {
            interfaceC19791.mo28383((C21200) null);
        }
        if (interfaceC19790 != null) {
            interfaceC19790.mo28386(null);
        }
    }

    @Override // l.InterfaceC4509
    /* JADX INFO: renamed from: ۙ */
    public void mo4354(TextView textView) {
        textView.setText("0");
    }
}
