package l;

import android.content.DialogInterface;
import android.widget.Button;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: renamed from: l.ۢ۫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q28R */
/* JADX INFO: loaded from: classes4.dex */
public final class C10126 extends AbstractC9843 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C6399 f32409;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ArrayList f32410;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C11223 f32411;

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(final C12915 c12915) {
        final DialogInterfaceC8327 dialogInterfaceC8327M8016;
        c12915.m31970("local");
        ArrayList arrayList = this.f32410;
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == 1) {
                final C25291 c25291 = (C25291) arrayList.get(0);
                C2361 c2361BuildDialog = c12915.m31979().buildDialog();
                c2361BuildDialog.m8021(R.string.MT_Protector);
                c2361BuildDialog.m8008(C21576.m49059(R.string.MT_Protector, c25291.f81686));
                c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩵۫۫
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C17085.m40232(Collections.singleton(c25291.f81684));
                        C6331.m18055();
                    }
                });
                c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
            } else {
                C2361 c2361BuildDialog2 = c12915.m31979().buildDialog();
                c2361BuildDialog2.m8021(R.string.MT_Protector);
                c2361BuildDialog2.m8008(C21576.m49059(R.string.MT_Protector, Integer.valueOf(arrayList.size())));
                c2361BuildDialog2.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۨ۫۫
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C10126.m26092(this.f39715);
                    }
                });
                c2361BuildDialog2.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                dialogInterfaceC8327M8016 = c2361BuildDialog2.m8016();
            }
        } else {
            final C11223 c11223 = new C11223(c12915.m31979());
            this.f32411 = c11223;
            AbstractC22044 abstractC22044M35193 = C14584.m35193(c12915.m31988() ? c12915.m31987().mo20212() : c12915.m31978(), new String[0]);
            c11223.f35403.setText(R.string.MT_Protector);
            int iM31981 = c12915.m31981();
            if (iM31981 <= 500 && C19632.m45281() && abstractC22044M35193.mo4292()) {
                this.f32409 = new C6399(c11223);
                c11223.m28284(AbstractC9843.m25619(c12915), iM31981 == 1 ? C21576.m49059(R.string.MT_Protector, c12915.m31989().mo8100()) : C21576.m49059(R.string.MT_Protector, Integer.valueOf(iM31981)));
            } else {
                c11223.f35394.setText(AbstractC9843.m25619(c12915));
            }
            C2361 c2361BuildDialog3 = c12915.m31979().buildDialog();
            c2361BuildDialog3.m8005(c11223.f35390);
            c2361BuildDialog3.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩺۫۫
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f78642.mo2480(c12915);
                }
            });
            c2361BuildDialog3.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            dialogInterfaceC8327M8016 = c2361BuildDialog3.m8016();
            final LinkedList linkedList = new LinkedList();
            for (InterfaceC2386 interfaceC2386 : c12915.m31982()) {
                if (interfaceC2386.isDirectory()) {
                    c11223.f35400++;
                    if (!interfaceC2386.mo8107()) {
                        linkedList.add(interfaceC2386.mo8093());
                    }
                } else {
                    c11223.f35402++;
                    if (!interfaceC2386.mo8107()) {
                        c11223.f35396 = interfaceC2386.getSize() + c11223.f35396;
                    }
                }
            }
            C21576.m49068(new RunnableC5458(6, c11223));
            if (linkedList.isEmpty()) {
                c11223.f35395.setVisibility(8);
            } else {
                C5261.f18540.execute(new Runnable() { // from class: l.ۘ۫۫
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11223 c11224;
                        String strM35186;
                        C12915 c12916 = c12915;
                        boolean z = C14584.m35193(c12916.m31978(), new String[0]).mo4295() && ((strM35186 = C14584.m35186(c12916.m31978())) == null || !C14584.m35198(strM35186, "Android/data"));
                        int i = 0;
                        while (true) {
                            LinkedList linkedList2 = linkedList;
                            if (linkedList2.isEmpty() || !dialogInterfaceC8327M8016.m22434()) {
                                return;
                            }
                            Iterator it = ((AbstractC22044) linkedList2.removeFirst()).mo4299(true).iterator();
                            while (true) {
                                boolean zHasNext = it.hasNext();
                                c11224 = c11223;
                                if (zHasNext) {
                                    AbstractC22044 abstractC22044 = (AbstractC22044) it.next();
                                    if (abstractC22044.mo4281()) {
                                        c11224.f35400++;
                                        if (!abstractC22044.m49860()) {
                                            linkedList2.addLast(abstractC22044);
                                        }
                                    } else {
                                        c11224.f35402++;
                                        if (!abstractC22044.m49860()) {
                                            c11224.f35396 = abstractC22044.mo4285() + c11224.f35396;
                                        }
                                    }
                                    if (z && (i = i + 1) > 1000) {
                                        c11224.m28283();
                                        z = false;
                                    }
                                }
                            }
                            C21576.m49068(new RunnableC5458(6, c11224));
                        }
                    }
                });
            }
        }
        Button buttonM22436 = dialogInterfaceC8327M8016.m22436();
        buttonM22436.setClickable(false);
        C21576.m49062(300L, new RunnableC24725(5, buttonM22436));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26092(C10126 c10126) {
        C17085.m40232((Set) C1170.stream(c10126.f32410).map(new C24057(3)).collect(C2025.toSet()));
        C6331.m18055();
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        ArrayList arrayList = this.f32410;
        arrayList.clear();
        int i = 0;
        for (InterfaceC2386 interfaceC2386 : c12915.m31982()) {
            if (interfaceC2386 instanceof C6004) {
                C6004 c6004 = (C6004) interfaceC2386;
                if (c6004.m17451()) {
                    arrayList.add(c6004.m17452());
                }
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            return !false;
        }
        return i == 0;
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2480(C12915 c12915) {
        int i = C13678.f43415;
        C8458 c8458 = new C8458(C19077.class);
        c8458.m22723(c12915.m31982());
        c8458.m22728(c12915);
        c8458.m22719("deleteFrom", c12915.m31980());
        C6399 c6399 = this.f32409;
        c8458.m22720("recycle", c6399 != null && c6399.f21594.m28286());
        c8458.m22720("speedMode", this.f32411.m28285());
        C11223 c11223 = this.f32411;
        c8458.m22715(c11223.f35402 + c11223.f35400, "minTotal");
        c8458.m22714();
    }
}
