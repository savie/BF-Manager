package l;

import android.view.View;
import android.widget.EditText;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۧۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10819 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23519 f36840;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public EditText f36841;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public View f36842;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public View f36843;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Supplier f36844;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f36845;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f36846;

    public C10819(C23519 c23519, int i, String str, Supplier supplier) {
        this.f36840 = c23519;
        this.f36846 = i;
        this.f36845 = str;
        this.f36844 = supplier;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27123(int i, int i2, int i3, View view) {
        View viewFindViewById = view.findViewById(i);
        C13638.requireNonNull(viewFindViewById);
        this.f36843 = viewFindViewById;
        EditText editText = (EditText) view.findViewById(i2);
        C13638.requireNonNull(editText);
        this.f36841 = editText;
        View viewFindViewById2 = view.findViewById(i3);
        C13638.requireNonNull(viewFindViewById2);
        this.f36842 = viewFindViewById2;
        this.f36841.setKeyListener(null);
        this.f36842.setOnClickListener(new View.OnClickListener() { // from class: l.ۛۛ᩹
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C10819 c10819 = this.f20065;
                C23519 c23519 = c10819.f36840;
                String strM40089 = c23519.f76118.m40089(c10819.f36846);
                if (strM40089 != null) {
                    C16737.m39272((CharSequence) (c23519.f76114 ? strM40089.toUpperCase() : strM40089.toLowerCase()));
                }
            }
        });
        m27122();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27122() {
        C23519 c23519 = this.f36840;
        C17168 c17168 = c23519.f76118;
        int i = this.f36846;
        String strM40089 = c17168.m40089(i);
        boolean z = c23519.f76118.m40088(i) && strM40089 != null;
        this.f36843.setVisibility(z ? 0 : 8);
        this.f36841.setVisibility(z ? 0 : 8);
        this.f36842.setVisibility(z ? 0 : 8);
        if (z) {
            this.f36841.setText(c23519.f76114 ? strM40089.toUpperCase() : strM40089.toLowerCase());
        }
    }
}
