package l;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛ᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C6293 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C17492 f21298;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f21299;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11359 f21300;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C23933 f21301;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C4647 f21302;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f21303;

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        final C21110 c21110 = (C21110) abstractC12554;
        final C13476 c13476 = (C13476) this.f21303.get(i);
        c21110.f68765.m27921(c13476.f44544.f2944);
        c21110.f68765.m27922(c13476.mo6562());
        c21110.f68764.setText(C16737.m39288(c13476.f44546));
        c21110.f68764.setTextColor(C20368.f65976);
        c21110.f68763.setVisibility(m17367() ? 0 : 8);
        c21110.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.֡᩶᩹
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6293.m17364(this.f2762, c13476);
            }
        });
        c21110.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ܽ᩶᩹
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return C6293.m17368(this.f53978, c13476, view);
            }
        });
        c21110.f68763.setOnTouchListener(new View.OnTouchListener() { // from class: l.۫᩶᩹
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C6293.m17366(this.f42240, c21110, motionEvent);
                return false;
            }
        });
    }

    public C6293(C11359 c11359, C17492 c17492, ArrayList arrayList) {
        this.f21300 = c11359;
        this.f21298 = c17492;
        this.f21303 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17365(C6293 c6293, DialogInterfaceC19356 dialogInterfaceC19356, C4647 c4647, View view) {
        c6293.f21299 = dialogInterfaceC19356;
        c6293.f21302 = c4647;
        c6293.f21301 = new C23933(view, new RunnableC17582(c6293));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m17367() {
        C23933 c23933 = this.f21301;
        return c23933 != null && c23933.m52754();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m17370(C6293 c6293) {
        C23933 c23933 = c6293.f21301;
        if (c23933 != null) {
            c23933.m52753();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m17371(C6293 c6293, C13476 c13476) {
        ArrayList arrayList = c6293.f21303;
        int iIndexOf = arrayList.indexOf(c13476);
        if (iIndexOf == -1) {
            iIndexOf = -1;
        } else {
            arrayList.remove(iIndexOf);
            c6293.notifyItemRemoved(iIndexOf);
        }
        if (iIndexOf == -1) {
            return;
        }
        c6293.f21300.m28446(c13476.f44543, false);
        if (arrayList.isEmpty()) {
            C17492 c17492 = c6293.f21298;
            DialogInterfaceC19356 dialogInterfaceC19356 = c6293.f21299;
            ViewTreeObserver viewTreeObserver = c17492.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC18994(viewTreeObserver, dialogInterfaceC19356, c17492));
        }
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C21110(0, LayoutInflater.from(this.f21300.f47137).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17364(C6293 c6293, C13476 c13476) {
        DialogInterfaceC19356 dialogInterfaceC19356;
        if (c6293.m17367() || (dialogInterfaceC19356 = c6293.f21299) == null) {
            return;
        }
        dialogInterfaceC19356.dismiss();
        c13476.mo6561(c6293.f21300.f47137);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [l.᩶᩶᩹] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m17368(final C6293 c6293, final C13476 c13476, View view) {
        DialogInterfaceC19356 dialogInterfaceC19356;
        if (c6293.m17367() || (dialogInterfaceC19356 = c6293.f21299) == null) {
            return false;
        }
        C11359.m28449(c6293.f21300, view, (InterfaceC4302) c13476, true, dialogInterfaceC19356, new Runnable() { // from class: l.ܺ᩶᩹
            @Override // java.lang.Runnable
            public final void run() {
                C6293.m17370(this.f52248);
            }
        }, (RunnableC20405) new Runnable() { // from class: l.᩶᩶᩹
            @Override // java.lang.Runnable
            public final void run() {
                C6293.m17371(this.f66108, c13476);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17366(C6293 c6293, C21110 c21110, MotionEvent motionEvent) {
        if (c6293.m17367() && c6293.f21302 != null && motionEvent.getActionMasked() == 0) {
            c6293.f21302.m12830(c21110);
        }
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f21303.size();
    }
}
