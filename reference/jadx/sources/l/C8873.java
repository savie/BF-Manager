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

/* JADX INFO: renamed from: l.ۡ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3WS */
/* JADX INFO: loaded from: classes3.dex */
public final class C8873 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0405 f30426;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f30427;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public List f30428;

    public C8873(C0405 c0405, AbstractActivityC12483 abstractActivityC12483) {
        this.f30426 = c0405;
        this.f30427 = abstractActivityC12483;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10245(this.f30427);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws C4987 {
        List list;
        String strSubstring;
        int i = C14804.f48396;
        C1313 c1313M8321 = C2724.m8305(4179).m8321();
        if (!c1313M8321.m4686()) {
            throw new C4987(C4820.m13401(c1313M8321, R.string.MT_Protector));
        }
        int iM4680 = c1313M8321.m4680();
        if (iM4680 == 0) {
            int iM4681 = c1313M8321.m4680();
            ArrayList arrayList = new ArrayList(iM4681);
            for (int i2 = 0; i2 < iM4681; i2++) {
                long jM4687 = c1313M8321.m4687();
                String strM4683 = c1313M8321.m4683();
                int iIndexOf = strM4683.indexOf(93, 0);
                if (iIndexOf == -1 || iIndexOf == strM4683.length() - 1) {
                    strSubstring = "";
                } else {
                    int i3 = iIndexOf + 1;
                    strSubstring = strM4683.substring(i3);
                    C13465.m32967(strSubstring, "substring(...)");
                    strM4683 = strM4683.substring(0, i3);
                    C13465.m32967(strM4683, "substring(...)");
                }
                JSONArray jSONArray = new JSONArray(strM4683);
                ArrayList arrayList2 = new ArrayList(jSONArray.size());
                int size = jSONArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList2.add(Integer.valueOf(jSONArray.getInt(i4)));
                }
                arrayList.add(0, new C3120(jM4687, strSubstring, arrayList2));
            }
            list = arrayList;
        } else {
            list = iM4680 != 1 ? null : Collections.EMPTY_LIST;
        }
        this.f30428 = list;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        List list = this.f30428;
        if (list == null) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        if (list.isEmpty()) {
            m23017((C3120) null);
            return;
        }
        final CharSequence[] charSequenceArr = new CharSequence[this.f30428.size()];
        for (int i = 0; i < this.f30428.size(); i++) {
            C3120 c3120 = (C3120) this.f30428.get(i);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C5319.m14739(c3120.m9393()));
            String strM9394 = c3120.m9394();
            if (!TextUtils.isEmpty(strM9394)) {
                spannableStringBuilder.append((CharSequence) " | ").append((CharSequence) strM9394);
            }
            spannableStringBuilder.append((CharSequence) "\n");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) c3120.m9395());
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C20368.f65988), length, length2, 17);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(C13932.m33770(12.0f)), length, length2, 17);
            charSequenceArr[i] = spannableStringBuilder;
        }
        final AbstractActivityC12483 abstractActivityC12483 = this.f30427;
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21267(charSequenceArr, new DialogInterface.OnClickListener() { // from class: l.᩺۫ۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C8873 c8873 = this.f74703;
                c8873.m23017((C3120) c8873.f30428.get(i2));
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        dialogInterfaceC19356M21269.m44376().setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: l.ܶ۫ۘ
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view, final int i2, long j) {
                C16195 c16195 = new C16195(adapterView.getContext(), view, 0);
                c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                final C8873 c8873 = this.f49643;
                final AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
                final DialogInterfaceC19356 dialogInterfaceC19356 = dialogInterfaceC19356M21269;
                final CharSequence[] charSequenceArr2 = charSequenceArr;
                c16195.m38296(new InterfaceC21133() { // from class: l.᩵۫ۘ
                    @Override // l.InterfaceC21133
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        C8873 c8874 = c8873;
                        final C0405 c0405 = c8874.f30426;
                        int itemId = menuItem.getItemId();
                        final AbstractActivityC12483 abstractActivityC12485 = abstractActivityC12484;
                        int i3 = i2;
                        final DialogInterfaceC19356 dialogInterfaceC19357 = dialogInterfaceC19356;
                        if (itemId == R.string.MT_Protector) {
                            C3120 c3121 = (C3120) c8874.f30428.get(i3);
                            C7461 c7461 = new C7461(c0405, abstractActivityC12485, c3121, abstractActivityC12485, dialogInterfaceC19357);
                            c7461.m40376(R.string.MT_Protector);
                            c7461.m40346((CharSequence) c3121.m9394());
                            c7461.m40375(50);
                            c7461.m40368(true);
                            return true;
                        }
                        if (menuItem.getItemId() == R.string.MT_Protector) {
                            CharSequence charSequence = charSequenceArr2[i3];
                            final C3120 c3122 = (C3120) c8874.f30428.get(i3);
                            C8067 c8067BuildDialog2 = abstractActivityC12485.buildDialog();
                            c8067BuildDialog2.m21274(R.string.MT_Protector);
                            c8067BuildDialog2.m21261(C16737.m39264(R.string.MT_Protector, "\n" + ((Object) charSequence)));
                            c8067BuildDialog2.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜ۫ۘ
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i4) {
                                    new C20867(c0405, abstractActivityC12485, c3122, dialogInterfaceC19357).m10243();
                                }
                            });
                            c8067BuildDialog2.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c8067BuildDialog2.m21269();
                        }
                        return true;
                    }
                });
                c16195.m38297();
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m23017(final C3120 c3120) {
        int i = DialogInterfaceC19356.f62401;
        final AbstractActivityC12483 abstractActivityC12483 = this.f30427;
        C8067 c8067 = new C8067(abstractActivityC12483);
        final ArrayList arrayList = new ArrayList(5);
        if (c3120 == null) {
            c8067.m21274(R.string.MT_Protector);
            arrayList.add(new C20162(R.string.MT_Protector, true));
            arrayList.add(new C20162(R.string.MT_Protector, true));
            arrayList.add(new C20162(R.string.MT_Protector, true));
            arrayList.add(new C20162(R.string.MT_Protector, true));
            arrayList.add(new C20162(R.string.MT_Protector, false));
            arrayList.add(new C20162(R.string.MT_Protector, true));
        } else {
            c8067.m21277(C5319.m14739(c3120.m9393()));
            ArrayList arrayList2 = (ArrayList) c3120.m9396();
            arrayList.add(new C20162(R.string.MT_Protector, arrayList2.contains(0)));
            arrayList.add(new C20162(R.string.MT_Protector, arrayList2.contains(1)));
            arrayList.add(new C20162(R.string.MT_Protector, arrayList2.contains(4) || arrayList2.contains(2)));
            arrayList.add(new C20162(R.string.MT_Protector, arrayList2.contains(3)));
            arrayList.add(new C20162(R.string.MT_Protector, arrayList2.contains(5)));
            arrayList.add(new C20162(R.string.MT_Protector, true));
        }
        final C20162[] c20162Arr = (C20162[]) C9030.stream(arrayList).filter(new C21572()).toArray(new C18044());
        if (c3120 == null) {
            c8067.m21274(R.string.MT_Protector);
        } else {
            c8067.m21277(C5319.m14739(c3120.m9393()));
        }
        boolean[] zArr = new boolean[c20162Arr.length];
        Arrays.fill(zArr, true);
        c8067.m21268(c20162Arr, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: l.ᩴ۫ۘ
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i2, boolean z) {
                c20162Arr[i2].f65476 = z;
            }
        });
        c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener(this) { // from class: l.۠۫ۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                new C15929(abstractActivityC12483, arrayList, c3120).m10243();
            }
        });
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21269().m44361().setOnClickListener(new ViewOnClickListenerC11553(abstractActivityC12483, 1));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f30427.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
