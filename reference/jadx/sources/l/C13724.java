package l;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C13724 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f43571;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C21887 f43572;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f43573;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1750 f43574;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C11999 f43575;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C25227 f43576;

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        final C18946 c18946 = (C18946) abstractC11800;
        final C5479 c5479 = (C5479) this.f43573.get(i);
        c18946.f61441.m9864(c5479.f19084.f66117);
        c18946.f61441.m9865(c5479.mo16306());
        c18946.f61440.setText(C21576.m49088(c5479.f19085));
        c18946.f61440.setTextColor(C3296.f10751);
        c18946.f61439.setVisibility(m33536() ? 0 : 8);
        c18946.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.ۡ۠ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13724.m33533(this.f30106, c5479);
            }
        });
        c18946.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ۖ۠ܳ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return C13724.m33537(this.f8118, c5479, view);
            }
        });
        c18946.f61439.setOnTouchListener(new View.OnTouchListener() { // from class: l.۠۠ܳ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C13724.m33535(this.f27808, c18946, motionEvent);
                return false;
            }
        });
    }

    public C13724(C1750 c1750, C25227 c25227, ArrayList arrayList) {
        this.f43574 = c1750;
        this.f43576 = c25227;
        this.f43573 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33534(C13724 c13724, DialogInterfaceC8327 dialogInterfaceC8327, C11999 c11999, View view) {
        c13724.f43571 = dialogInterfaceC8327;
        c13724.f43575 = c11999;
        c13724.f43572 = new C21887(view, new RunnableC7013(c13724));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m33536() {
        C21887 c21887 = this.f43572;
        return c21887 != null && c21887.m49580();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m33539(C13724 c13724) {
        C21887 c21887 = c13724.f43572;
        if (c21887 != null) {
            c21887.m49579();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m33540(C13724 c13724, C5479 c5479) {
        ArrayList arrayList = c13724.f43573;
        int iIndexOf = arrayList.indexOf(c5479);
        if (iIndexOf == -1) {
            iIndexOf = -1;
        } else {
            arrayList.remove(iIndexOf);
            c13724.notifyItemRemoved(iIndexOf);
        }
        if (iIndexOf == -1) {
            return;
        }
        c13724.f43574.m6155(c5479.f19082, false);
        if (arrayList.isEmpty()) {
            C25227 c25227 = c13724.f43576;
            DialogInterfaceC8327 dialogInterfaceC8327 = c13724.f43571;
            ViewTreeObserver viewTreeObserver = c25227.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC14470(viewTreeObserver, dialogInterfaceC8327, c25227));
        }
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C18946(0, LayoutInflater.from(this.f43574.f22654).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33533(C13724 c13724, C5479 c5479) {
        DialogInterfaceC8327 dialogInterfaceC8327;
        if (c13724.m33536() || (dialogInterfaceC8327 = c13724.f43571) == null) {
            return;
        }
        dialogInterfaceC8327.dismiss();
        c5479.mo16305(c13724.f43574.f22654);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [l.֨۠ܳ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m33537(final C13724 c13724, final C5479 c5479, View view) {
        DialogInterfaceC8327 dialogInterfaceC8327;
        if (c13724.m33536() || (dialogInterfaceC8327 = c13724.f43571) == null) {
            return false;
        }
        C1750.m6158(c13724.f43574, view, (InterfaceC12936) c5479, true, dialogInterfaceC8327, new Runnable() { // from class: l.ۢ۠ܳ
            @Override // java.lang.Runnable
            public final void run() {
                C13724.m33539(this.f32107);
            }
        }, (RunnableC1047) new Runnable() { // from class: l.֨۠ܳ
            @Override // java.lang.Runnable
            public final void run() {
                C13724.m33540(this.f3773, c5479);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33535(C13724 c13724, C18946 c18946, MotionEvent motionEvent) {
        if (c13724.m33536() && c13724.f43575 != null && motionEvent.getActionMasked() == 0) {
            c13724.f43575.m30178(c18946);
        }
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f43573.size();
    }
}
