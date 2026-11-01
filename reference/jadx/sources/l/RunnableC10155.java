package l;

import android.widget.CheckBox;
import android.widget.RadioButton;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۤ۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: P4TK */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC10155 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f34664;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnClickListenerC20033 f34665;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f34666;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f34667;

    public /* synthetic */ RunnableC10155(DialogInterfaceOnClickListenerC20033 dialogInterfaceOnClickListenerC20033, boolean z, boolean z2, C11545 c11545) {
        this.f34665 = dialogInterfaceOnClickListenerC20033;
        this.f34667 = z;
        this.f34664 = z2;
        this.f34666 = c11545;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DialogInterfaceOnClickListenerC20033 dialogInterfaceOnClickListenerC20033 = this.f34665;
        AbstractC12068 abstractC12068 = dialogInterfaceOnClickListenerC20033.f64145;
        String str = dialogInterfaceOnClickListenerC20033.f64151;
        CheckBox checkBox = dialogInterfaceOnClickListenerC20033.f64150;
        RadioButton[] radioButtonArr = dialogInterfaceOnClickListenerC20033.f64149;
        CheckBox checkBox2 = dialogInterfaceOnClickListenerC20033.f64147;
        if (this.f34667) {
            checkBox2.setVisibility(0);
            Integer numM10048 = C3386.m10048(dialogInterfaceOnClickListenerC20033.f64148);
            if (numM10048 != null) {
                checkBox2.setChecked(true);
                radioButtonArr[C3386.m10039(numM10048.intValue())].callOnClick();
                checkBox.setChecked(C3386.m10049(numM10048.intValue()));
                return;
            }
            if (this.f34664) {
                HashMap map = C0674.f2833;
                if (map.containsKey(str)) {
                    checkBox2.setChecked(true);
                    Integer num = (Integer) map.get(str);
                    C13638.requireNonNull(num);
                    int iIntValue = num.intValue();
                    radioButtonArr[C3386.m10039(iIntValue)].callOnClick();
                    checkBox.setChecked(C3386.m10049(iIntValue));
                    return;
                }
            }
            if (abstractC12068 != null) {
                HashMap map2 = abstractC12068.f40389;
                if (map2.containsKey(str)) {
                    checkBox2.setChecked(true);
                    Integer num2 = (Integer) map2.get(str);
                    C13638.requireNonNull(num2);
                    int iIntValue2 = num2.intValue();
                    radioButtonArr[C3386.m10039(iIntValue2)].callOnClick();
                    checkBox.setChecked(C3386.m10049(iIntValue2));
                    return;
                }
            }
            checkBox2.setChecked(false);
        } else {
            checkBox2.setVisibility(8);
            checkBox2.setChecked(false);
        }
        C11545 c11545 = this.f34666;
        radioButtonArr[c11545.m28762() ? C0674.f2830 : C0674.f2824].callOnClick();
        checkBox.setChecked(c11545.m28762() ? C0674.f2827 : C0674.f2834);
    }
}
