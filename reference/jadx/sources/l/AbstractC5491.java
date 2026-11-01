package l;

import android.widget.CompoundButton;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5I2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5491 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC12483 f18887;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractDialogInterfaceOnClickListenerC4454 f18888;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f18889;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6919();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6920(C2668 c2668, String str);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo15184(String str) {
        return false;
    }

    public AbstractC5491(AbstractActivityC12483 abstractActivityC12483, boolean z) {
        this(abstractActivityC12483, z, "filter_record", "filter_match_case", "filter_regex", "filter_exactly_match");
    }

    public AbstractC5491(AbstractActivityC12483 abstractActivityC12483, boolean z, String str, String str2, String str3, String str4) {
        ArrayList arrayList = new ArrayList();
        this.f18889 = arrayList;
        this.f18887 = abstractActivityC12483;
        C16465 c16465 = new C16465(abstractActivityC12483);
        C16465 c16466 = new C16465(abstractActivityC12483);
        C16465 c16467 = new C16465(abstractActivityC12483);
        C11842 c11842 = new C11842(this, abstractActivityC12483, str, z ? R.string.MT_Protector : -1, c16466, c16467, c16465, abstractActivityC12483);
        c11842.m12428(R.string.MT_Protector);
        this.f18888 = c11842;
        c16466.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ܰܿۚ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                this.f45929.f18888.m12433().m23518(z2);
            }
        });
        c16465.setText(R.string.MT_Protector);
        c16465.setTag(str2);
        c16465.setChecked(ApplicationC0716.f2992.getBoolean(str2, false));
        c16466.setText(R.string.MT_Protector);
        c16466.setTag(str3);
        c16466.setChecked(ApplicationC0716.f2992.getBoolean(str3, false));
        c16467.setText(R.string.MT_Protector);
        c16467.setTag(str4);
        c16467.setChecked(ApplicationC0716.f2992.getBoolean(str4, false));
        c11842.m12429(c16465);
        c11842.m12429(c16466);
        c11842.m12429(c16467);
        arrayList.add(c16465);
        arrayList.add(c16466);
        arrayList.add(c16467);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15182(C12709 c12709) {
        this.f18888.m12430(c12709, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15181(int i, boolean z) {
        C16465 c16465 = new C16465(this.f18887);
        c16465.setText(i);
        c16465.setChecked(z);
        this.f18889.add(c16465);
        this.f18888.m12430(c16465, 1);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15185() {
        this.f18888.m12425();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m15183(int i) {
        int i2;
        ArrayList arrayList = this.f18889;
        if (i >= 0 && (i2 = i + 3) < arrayList.size()) {
            return ((C16465) arrayList.get(i2)).isChecked();
        }
        StringBuilder sbM40153 = C17214.m40153(i, "Index: ", ", Size: ");
        sbM40153.append(arrayList.size() - 3);
        throw new IndexOutOfBoundsException(sbM40153.toString());
    }
}
