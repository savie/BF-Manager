package l;

import android.widget.CheckBox;
import android.widget.RadioButton;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4TK */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3812 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f13002;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnClickListenerC0083 f13003;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f13004;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f13005;

    public /* synthetic */ RunnableC3812(DialogInterfaceOnClickListenerC0083 dialogInterfaceOnClickListenerC0083, boolean z, boolean z2, C8614 c8614) {
        this.f13003 = dialogInterfaceOnClickListenerC0083;
        this.f13005 = z;
        this.f13004 = z2;
        this.f13002 = c8614;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DialogInterfaceOnClickListenerC0083 dialogInterfaceOnClickListenerC0083 = this.f13003;
        AbstractC0148 abstractC0148 = dialogInterfaceOnClickListenerC0083.f995;
        String str = dialogInterfaceOnClickListenerC0083.f997;
        CheckBox checkBox = dialogInterfaceOnClickListenerC0083.f996;
        RadioButton[] radioButtonArr = dialogInterfaceOnClickListenerC0083.f991;
        CheckBox checkBox2 = dialogInterfaceOnClickListenerC0083.f992;
        if (this.f13005) {
            checkBox2.setVisibility(0);
            Integer numM34289 = C14118.m34289(dialogInterfaceOnClickListenerC0083.f994);
            if (numM34289 != null) {
                checkBox2.setChecked(true);
                radioButtonArr[C14118.m34280(numM34289.intValue())].callOnClick();
                checkBox.setChecked(C14118.m34290(numM34289.intValue()));
                return;
            }
            if (this.f13004) {
                HashMap map = C17423.f56652;
                if (map.containsKey(str)) {
                    checkBox2.setChecked(true);
                    Integer num = (Integer) map.get(str);
                    C17359.requireNonNull(num);
                    int iIntValue = num.intValue();
                    radioButtonArr[C14118.m34280(iIntValue)].callOnClick();
                    checkBox.setChecked(C14118.m34290(iIntValue));
                    return;
                }
            }
            if (abstractC0148 != null) {
                HashMap map2 = abstractC0148.f1120;
                if (map2.containsKey(str)) {
                    checkBox2.setChecked(true);
                    Integer num2 = (Integer) map2.get(str);
                    C17359.requireNonNull(num2);
                    int iIntValue2 = num2.intValue();
                    radioButtonArr[C14118.m34280(iIntValue2)].callOnClick();
                    checkBox.setChecked(C14118.m34290(iIntValue2));
                    return;
                }
            }
            checkBox2.setChecked(false);
        } else {
            checkBox2.setVisibility(8);
            checkBox2.setChecked(false);
        }
        C8614 c8614 = this.f13002;
        radioButtonArr[c8614.m23195() ? C17423.f56648 : C17423.f56655].callOnClick();
        checkBox.setChecked(c8614.m23195() ? C17423.f56653 : C17423.f56651);
    }
}
