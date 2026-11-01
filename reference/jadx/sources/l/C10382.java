package l;

import android.widget.EditText;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.ۤܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JB */
/* JADX INFO: loaded from: classes3.dex */
public final class C10382 extends AbstractC21013 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC12499 f35555;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35556;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6148 f35557;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10382(ActivityC12499 activityC12499, ActivityC12499 activityC124910, int i, C6148 c6148) {
        super(activityC124910);
        this.f35555 = activityC12499;
        this.f35556 = i;
        this.f35557 = c6148;
    }

    @Override // l.AbstractC21013
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo13875() {
        int iM33769;
        TextInputLayout textInputLayoutM47200 = m47200(0);
        TextInputLayout textInputLayoutM47201 = m47200(1);
        EditText editText = textInputLayoutM47200.getEditText();
        C13638.requireNonNull(editText);
        EditText editText2 = textInputLayoutM47201.getEditText();
        C13638.requireNonNull(editText2);
        String string = editText.getText().toString();
        String string2 = editText2.getText().toString();
        if (string.isEmpty() && string2.isEmpty()) {
            return true;
        }
        boolean zIsEmpty = string.isEmpty();
        ActivityC12499 activityC12499 = this.f35555;
        if (zIsEmpty) {
            textInputLayoutM47200.setError(activityC12499.getString(R.string.MT_Protector));
            iM33769 = C13932.m33769(8.0f);
        } else {
            int size = activityC12499.f41797.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                }
                if (string.equals(((C6148) activityC12499.f41797.get(i)).f21002)) {
                    break;
                }
                i++;
            }
            int i2 = this.f35556;
            if (i != -1 && i != i2) {
                textInputLayoutM47200.setError(activityC12499.getString(R.string.MT_Protector));
                iM33769 = C13932.m33769(8.0f);
            } else {
                if (i2 == -1) {
                    activityC12499.f41797.add(new C6148(string, string2));
                    activityC12499.f41795.notifyItemInserted(activityC12499.f41797.size() - 1);
                } else {
                    C6148 c6148 = this.f35557;
                    c6148.f21002 = string;
                    c6148.f21001 = string2;
                    activityC12499.f41795.notifyItemChanged(i2);
                }
                C11088.m27977();
                return true;
            }
        }
        C7000.m18806(textInputLayoutM47201, -1, iM33769, -1, -1);
        return false;
    }
}
