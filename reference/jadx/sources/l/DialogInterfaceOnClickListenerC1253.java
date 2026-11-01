package l;

import android.content.DialogInterface;
import android.widget.EditText;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.֨ܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC1253 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Serializable f5441;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5442;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f5443;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f5444;

    public /* synthetic */ DialogInterfaceOnClickListenerC1253(Object obj, Serializable serializable, Object obj2, int i) {
        this.f5442 = i;
        this.f5444 = obj;
        this.f5441 = serializable;
        this.f5443 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f5442) {
            case 0:
                C12543 c12543 = (C12543) this.f5444;
                c12543.m31191(new InterfaceC21009() { // from class: l.᩹ܿ֨
                    @Override // l.InterfaceC21009
                    public final C17887 run() {
                        this.f73178.f41983.m22552(str);
                        return null;
                    }
                }, new RunnableC3787(3, (DialogInterfaceC19356) this.f5443));
                break;
            case 1:
                Runnable runnable = (Runnable) this.f5444;
                ArrayList arrayList = (ArrayList) this.f5441;
                EditText editText = (EditText) this.f5443;
                if (runnable != null && i == arrayList.size()) {
                    runnable.run();
                } else {
                    editText.setText(((AbstractC20745) arrayList.get(i)).mo33986());
                    editText.setSelection(editText.length());
                }
                break;
            default:
                C19575 c19575 = (C19575) this.f5444;
                final AbstractC20745 abstractC20745 = (AbstractC20745) this.f5441;
                C8286 c8286 = (C8286) this.f5443;
                ArrayList arrayList2 = c19575.f21338;
                C12665 c12665 = c19575.f21343;
                try {
                    C4716.f16636.submit(new Callable() { // from class: l.᩸ܺ᩹
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(abstractC20745.mo24647());
                        }
                    }).get(100L, TimeUnit.MILLISECONDS);
                    break;
                } catch (Exception unused) {
                }
                int bindingAdapterPosition = c8286.getBindingAdapterPosition();
                arrayList2.remove((bindingAdapterPosition - c12665.m31486(c19575)) - 1);
                if (arrayList2.size() <= 0) {
                    c12665.notifyItemRangeRemoved(bindingAdapterPosition - 1, 2);
                } else {
                    c12665.notifyItemRangeRemoved(bindingAdapterPosition, 1);
                }
                break;
        }
    }
}
