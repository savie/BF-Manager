package l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import bin.mt.json.JSONArray;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ܽܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3WS */
/* JADX INFO: loaded from: classes5.dex */
public final class C17648 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f58021;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6462 f58022;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public List f58023;

    public C17648(C6462 c6462, AbstractActivityC17204 abstractActivityC17204) {
        this.f58022 = c6462;
        this.f58021 = abstractActivityC17204;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8190(this.f58021);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws C4866 {
        List list;
        String strSubstring;
        int i = C0618.f2435;
        ReentrantLock reentrantLock = C11650.f37690;
        C13778 c13778M8684 = C2592.m8672(4179).m8684();
        if (!c13778M8684.m33676()) {
            throw new C4866(C1364.m5010(c13778M8684, R.string.MT_Protector));
        }
        int iM33672 = c13778M8684.m33672();
        if (iM33672 == 0) {
            int iM33673 = c13778M8684.m33672();
            ArrayList arrayList = new ArrayList(iM33673);
            for (int i2 = 0; i2 < iM33673; i2++) {
                long jM33684 = c13778M8684.m33684();
                String strM33677 = c13778M8684.m33677();
                int iIndexOf = strM33677.indexOf(93, 0);
                if (iIndexOf == -1 || iIndexOf == strM33677.length() - 1) {
                    strSubstring = "";
                } else {
                    int i3 = iIndexOf + 1;
                    strSubstring = strM33677.substring(i3);
                    C15243.m36591(strSubstring, "substring(...)");
                    strM33677 = strM33677.substring(0, i3);
                    C15243.m36591(strM33677, "substring(...)");
                }
                JSONArray jSONArray = new JSONArray(strM33677);
                ArrayList arrayList2 = new ArrayList(jSONArray.size());
                int size = jSONArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList2.add(Integer.valueOf(jSONArray.getInt(i4)));
                }
                arrayList.add(0, new C1079(jM33684, strSubstring, arrayList2));
            }
            list = arrayList;
        } else {
            list = iM33672 != 1 ? null : Collections.EMPTY_LIST;
        }
        this.f58023 = list;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        List list = this.f58023;
        if (list == null) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        if (list.isEmpty()) {
            m41308((C1079) null);
            return;
        }
        final CharSequence[] charSequenceArr = new CharSequence[this.f58023.size()];
        for (int i = 0; i < this.f58023.size(); i++) {
            C1079 c1079 = (C1079) this.f58023.get(i);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C22482.m50713(c1079.m4044()));
            String strM4041 = c1079.m4041();
            if (!TextUtils.isEmpty(strM4041)) {
                spannableStringBuilder.append((CharSequence) " | ").append((CharSequence) strM4041);
            }
            spannableStringBuilder.append((CharSequence) "\n");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) c1079.m4042());
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C3296.f10741), length, length2, 17);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(C6907.m19161(12.0f)), length, length2, 17);
            charSequenceArr[i] = spannableStringBuilder;
        }
        final AbstractActivityC17204 abstractActivityC17204 = this.f58021;
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8014(charSequenceArr, new DialogInterface.OnClickListener() { // from class: l.ܳܳۧ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C17648 c17648 = this.f50226;
                c17648.m41308((C1079) c17648.f58023.get(i2));
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        dialogInterfaceC8327M8016.m22437().setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: l.۫ܳۧ
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view, final int i2, long j) {
                C18452 c18452 = new C18452(adapterView.getContext(), view, 0);
                c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                final C17648 c17648 = this.f42099;
                final AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
                final DialogInterfaceC8327 dialogInterfaceC8327 = dialogInterfaceC8327M8016;
                final CharSequence[] charSequenceArr2 = charSequenceArr;
                c18452.m42994(new InterfaceC21436() { // from class: l.ܺܳۧ
                    @Override // l.InterfaceC21436
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        C17648 c17649 = c17648;
                        final C6462 c6462 = c17649.f58022;
                        int itemId = menuItem.getItemId();
                        final AbstractActivityC17204 abstractActivityC17206 = abstractActivityC17205;
                        int i3 = i2;
                        final DialogInterfaceC8327 dialogInterfaceC8328 = dialogInterfaceC8327;
                        if (itemId == R.string.MT_Protector) {
                            C1079 c10710 = (C1079) c17649.f58023.get(i3);
                            C23616 c23616 = new C23616(c6462, abstractActivityC17206, c10710, abstractActivityC17206, dialogInterfaceC8328);
                            c23616.m22945(R.string.MT_Protector);
                            c23616.m22924((CharSequence) c10710.m4041());
                            c23616.m22942(50);
                            c23616.m22955(true);
                            return true;
                        }
                        if (menuItem.getItemId() == R.string.MT_Protector) {
                            CharSequence charSequence = charSequenceArr2[i3];
                            final C1079 c10711 = (C1079) c17649.f58023.get(i3);
                            C2361 c2361BuildDialog2 = abstractActivityC17206.buildDialog();
                            c2361BuildDialog2.m8021(R.string.MT_Protector);
                            c2361BuildDialog2.m8008(C21576.m49059(R.string.MT_Protector, "\n" + ((Object) charSequence)));
                            c2361BuildDialog2.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩴܳۧ
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i4) {
                                    new C3478(c6462, abstractActivityC17206, c10711, dialogInterfaceC8328).m8197();
                                }
                            });
                            c2361BuildDialog2.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c2361BuildDialog2.m8016();
                        }
                        return true;
                    }
                });
                c18452.mo21878();
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m41308(final C1079 c1079) {
        int i = DialogInterfaceC8327.f27315;
        final AbstractActivityC17204 abstractActivityC17204 = this.f58021;
        C2361 c2361 = new C2361(abstractActivityC17204);
        final ArrayList arrayList = new ArrayList(5);
        if (c1079 == null) {
            c2361.m8021(R.string.MT_Protector);
            arrayList.add(new C12427(R.string.MT_Protector, true));
            arrayList.add(new C12427(R.string.MT_Protector, true));
            arrayList.add(new C12427(R.string.MT_Protector, true));
            arrayList.add(new C12427(R.string.MT_Protector, true));
            arrayList.add(new C12427(R.string.MT_Protector, false));
            arrayList.add(new C12427(R.string.MT_Protector, true));
        } else {
            c2361.m8024(C22482.m50713(c1079.m4044()));
            ArrayList arrayList2 = (ArrayList) c1079.m4043();
            arrayList.add(new C12427(R.string.MT_Protector, arrayList2.contains(0)));
            arrayList.add(new C12427(R.string.MT_Protector, arrayList2.contains(1)));
            arrayList.add(new C12427(R.string.MT_Protector, arrayList2.contains(4) || arrayList2.contains(2)));
            arrayList.add(new C12427(R.string.MT_Protector, arrayList2.contains(3)));
            arrayList.add(new C12427(R.string.MT_Protector, arrayList2.contains(5)));
            arrayList.add(new C12427(R.string.MT_Protector, true));
        }
        final C12427[] c12427Arr = (C12427[]) C1170.stream(arrayList).filter(new C5716()).toArray(new C1987());
        if (c1079 == null) {
            c2361.m8021(R.string.MT_Protector);
        } else {
            c2361.m8024(C22482.m50713(c1079.m4044()));
        }
        boolean[] zArr = new boolean[c12427Arr.length];
        Arrays.fill(zArr, true);
        c2361.m8015(c12427Arr, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: l.ۧܳۧ
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i2, boolean z) {
                c12427Arr[i2].f39959 = z;
            }
        });
        c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener(this) { // from class: l.᩻ܳۧ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                new C20632(abstractActivityC17204, arrayList, c1079).m8197();
            }
        });
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8016().m22440().setOnClickListener(new ViewOnClickListenerC12790(5, abstractActivityC17204));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f58021.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
