package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.io.IOException;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.᩻ܶ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: GAHN */
/* JADX INFO: loaded from: classes.dex */
public final class C25132 extends AbstractC9843 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C11223 f81258;

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        ((C6728) c12915.m31987()).m18803();
        return true;
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(final C12915 c12915) {
        c12915.m31970(b.k);
        C11223 c11223 = new C11223(c12915.m31979());
        this.f81258 = c11223;
        c11223.f35403.setText(R.string.MT_Protector);
        this.f81258.f35394.setText(AbstractC9843.m25619(c12915));
        C2361 c2361BuildDialog = c12915.m31979().buildDialog();
        c2361BuildDialog.m8005(this.f81258.f35390);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܳܶ۫
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f50279.mo2480(c12915);
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        final LinkedList linkedList = new LinkedList();
        for (InterfaceC2386 interfaceC2386 : c12915.m31982()) {
            if (interfaceC2386.isDirectory()) {
                this.f81258.f35400++;
                if (!interfaceC2386.mo8107()) {
                    linkedList.add(interfaceC2386.getPath());
                }
            } else {
                this.f81258.f35402++;
                if (!interfaceC2386.mo8107()) {
                    C11223 c11224 = this.f81258;
                    c11224.f35396 = interfaceC2386.getSize() + c11224.f35396;
                }
            }
        }
        C11223 c11225 = this.f81258;
        c11225.getClass();
        C21576.m49068(new RunnableC5458(6, c11225));
        if (linkedList.isEmpty()) {
            this.f81258.f35395.setVisibility(8);
        } else {
            C5261.f18540.execute(new Runnable() { // from class: l.۫ܶ۫
                @Override // java.lang.Runnable
                public final void run() {
                    C25132.m56000(this.f42147, c12915, linkedList, dialogInterfaceC8327M8016);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56000(C25132 c25132, C12915 c12915, LinkedList linkedList, DialogInterfaceC8327 dialogInterfaceC8327) {
        AbstractC18881 abstractC18881 = (AbstractC18881) c12915.m31987().mo10174();
        while (!linkedList.isEmpty() && dialogInterfaceC8327.m22434()) {
            try {
                for (InterfaceC2386 interfaceC2386 : abstractC18881.mo20830((String) linkedList.removeFirst(), true)) {
                    if (interfaceC2386.isDirectory()) {
                        c25132.f81258.f35400++;
                        if (!interfaceC2386.mo8107()) {
                            linkedList.addLast(interfaceC2386.getPath());
                        }
                    } else {
                        c25132.f81258.f35402++;
                        if (!interfaceC2386.mo8107()) {
                            C11223 c11223 = c25132.f81258;
                            c11223.f35396 = interfaceC2386.getSize() + c11223.f35396;
                        }
                    }
                }
                C11223 c11224 = c25132.f81258;
                c11224.getClass();
                C21576.m49068(new RunnableC5458(6, c11224));
            } catch (IOException e) {
                c12915.m31979().m40401(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2480(C12915 c12915) {
        int i = C13678.f43415;
        C8458 c8458 = new C8458(C11705.class);
        c8458.m22723(c12915.m31982());
        c8458.m22728(c12915);
        c8458.m22724(c12915.m31987());
        c8458.m22719("deleteFrom", c12915.m31980());
        C11223 c11223 = this.f81258;
        c8458.m22715(c11223.f35402 + c11223.f35400, "minTotal");
        c8458.m22714();
    }
}
