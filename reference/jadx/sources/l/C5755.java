package l;

import android.content.DialogInterface;
import android.widget.Button;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: renamed from: l.ۛ֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Q28R */
/* JADX INFO: loaded from: classes3.dex */
public final class C5755 extends AbstractC4674 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public ArrayList f19549;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C7166 f19550;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C11734 f19551;

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(final C21422 c21422) {
        final DialogInterfaceC19356 dialogInterfaceC19356M21269;
        c21422.m47963("local");
        ArrayList arrayList = this.f19549;
        int i = 3;
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == 1) {
                C18295 c18295 = (C18295) arrayList.get(0);
                C8067 c8067BuildDialog = c21422.m47980().buildDialog();
                c8067BuildDialog.m21274(R.string.MT_Protector);
                c8067BuildDialog.m21261(C16737.m39264(R.string.MT_Protector, c18295.f58377));
                c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC13771(2, c18295));
                c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
            } else {
                C8067 c8067BuildDialog2 = c21422.m47980().buildDialog();
                c8067BuildDialog2.m21274(R.string.MT_Protector);
                c8067BuildDialog2.m21261(C16737.m39264(R.string.MT_Protector, Integer.valueOf(arrayList.size())));
                c8067BuildDialog2.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC20268(i, this));
                c8067BuildDialog2.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                dialogInterfaceC19356M21269 = c8067BuildDialog2.m21269();
            }
        } else {
            final C11734 c11734 = new C11734(c21422.m47980());
            this.f19551 = c11734;
            AbstractC20745 abstractC20745M15313 = C5553.m15313(c21422.m47977() ? c21422.m47960().mo28639() : c21422.m47959(), new String[0]);
            c11734.f39446.setText(R.string.MT_Protector);
            int iM47975 = c21422.m47975();
            if (iM47975 <= 500 && C20370.m46024() && abstractC20745M15313.mo35233()) {
                this.f19550 = new C7166(c11734);
                c11734.m29332(AbstractC4674.m12941(c21422), iM47975 == 1 ? C16737.m39264(R.string.MT_Protector, c21422.m47981().mo7963()) : C16737.m39264(R.string.MT_Protector, Integer.valueOf(iM47975)));
            } else {
                c11734.f39439.setText(AbstractC4674.m12941(c21422));
            }
            C8067 c8067BuildDialog3 = c21422.m47980().buildDialog();
            c8067BuildDialog3.m21258(c11734.f39440);
            c8067BuildDialog3.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷֫᩹
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f67031.mo6949(c21422);
                }
            });
            c8067BuildDialog3.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            dialogInterfaceC19356M21269 = c8067BuildDialog3.m21269();
            final LinkedList linkedList = new LinkedList();
            for (InterfaceC2557 interfaceC2557 : c21422.m47979()) {
                if (interfaceC2557.isDirectory()) {
                    c11734.f39438++;
                    if (!interfaceC2557.mo7986()) {
                        linkedList.add(interfaceC2557.mo7989());
                    }
                } else {
                    c11734.f39435++;
                    if (!interfaceC2557.mo7986()) {
                        c11734.f39448 = interfaceC2557.getSize() + c11734.f39448;
                    }
                }
            }
            C16737.m39273(new RunnableC17894(3, c11734));
            if (linkedList.isEmpty()) {
                c11734.f39434.setVisibility(8);
            } else {
                C4716.f16636.execute(new Runnable() { // from class: l.ܺ֫᩹
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11734 c11735;
                        String strM15306;
                        C21422 c21423 = c21422;
                        boolean z = C5553.m15313(c21423.m47959(), new String[0]).mo36912() && ((strM15306 = C5553.m15306(c21423.m47959())) == null || !C5553.m15319(strM15306, "Android/data"));
                        int i2 = 0;
                        while (true) {
                            LinkedList linkedList2 = linkedList;
                            if (linkedList2.isEmpty() || !dialogInterfaceC19356M21269.m44375()) {
                                return;
                            }
                            Iterator it = ((AbstractC20745) linkedList2.removeFirst()).mo33983(true).iterator();
                            while (true) {
                                boolean zHasNext = it.hasNext();
                                c11735 = c11734;
                                if (zHasNext) {
                                    AbstractC20745 abstractC20745 = (AbstractC20745) it.next();
                                    if (abstractC20745.mo33974()) {
                                        c11735.f39438++;
                                        if (!abstractC20745.m46723()) {
                                            linkedList2.addLast(abstractC20745);
                                        }
                                    } else {
                                        c11735.f39435++;
                                        if (!abstractC20745.m46723()) {
                                            c11735.f39448 = abstractC20745.mo33964() + c11735.f39448;
                                        }
                                    }
                                    if (z && (i2 = i2 + 1) > 1000) {
                                        c11735.m29331();
                                        z = false;
                                    }
                                }
                            }
                            C16737.m39273(new RunnableC17894(3, c11735));
                        }
                    }
                });
            }
        }
        Button buttonM44373 = dialogInterfaceC19356M21269.m44373();
        buttonM44373.setClickable(false);
        C16737.m39267(300L, new RunnableC3787(5, buttonM44373));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15849(C5755 c5755) {
        C19001.m43713((Set) C9030.stream(c5755.f19549).map(new C16485(2)).collect(C1890.toSet()));
        C21094.m47530();
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        ArrayList arrayList = this.f19549;
        arrayList.clear();
        int i = 0;
        for (InterfaceC2557 interfaceC2557 : c21422.m47979()) {
            if (interfaceC2557 instanceof C6794) {
                C6794 c6794 = (C6794) interfaceC2557;
                if (c6794.m18395()) {
                    arrayList.add(c6794.m18396());
                }
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            return !false;
        }
        return i == 0;
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۚ */
    public final void mo6949(C21422 c21422) {
        int i = C20725.f67443;
        C10142 c10142 = new C10142(C17044.class);
        c10142.m25772(c21422.m47979());
        c10142.m25777(c21422);
        c10142.m25768("deleteFrom", c21422.m47976());
        C7166 c7166 = this.f19550;
        c10142.m25769("recycle", c7166 != null && c7166.f23948.m29334());
        c10142.m25769("speedMode", this.f19551.m29333());
        C11734 c11734 = this.f19551;
        c10142.m25764(c11734.f39435 + c11734.f39438, "minTotal");
        c10142.m25763();
    }
}
