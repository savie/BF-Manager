package l;

import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ܽۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 29SR */
/* JADX INFO: loaded from: classes4.dex */
public final class C16611 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final LinkedList f53307 = new LinkedList();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f53308;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public TextView f53309;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7438 f53310;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C6606 f53311;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f53312;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f53313;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Drawable f53314;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC0382 f53315;

    public C16611(AbstractActivityC12483 abstractActivityC12483, ArrayList arrayList) {
        this.f53308 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f53308.add(new C20139(this, (C14459) arrayList.get(i), i));
        }
        abstractActivityC12483.getClass();
        Drawable drawableMutate = C10405.m26304(abstractActivityC12483, R.drawable.MT_Protector).mutate();
        this.f53314 = drawableMutate;
        drawableMutate.setColorFilter(C9682.m24638(C20368.f65988));
        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
        C1439 c1439 = (C1439) viewM30995.findViewById(R.id.searchView);
        this.f53309 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        C6606 c6606 = (C6606) viewM30995.findViewById(R.id.MT_Protector);
        this.f53311 = c6606;
        C7438 c7438 = new C7438(this);
        this.f53310 = c7438;
        c6606.setAdapter((ListAdapter) c7438);
        c6606.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ۡۨ֨
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                C16611.m39057(this.f30387, i2);
            }
        });
        c6606.setFastScrollEnabled(true);
        C16754.m39314(c6606);
        c1439.m5029(new C10261(this));
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC6050(1, this, arrayList));
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f53312 = c8067BuildDialog.m21252();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39057(C16611 c16611, int i) {
        C7438 c7438 = c16611.f53310;
        int i2 = ((C20139) c7438.f24812.get(i)).f65374;
        if (c16611.f53313 != i2) {
            c16611.f53313 = i2;
            c7438.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39059(C16611 c16611, List list) {
        InterfaceC0382 interfaceC0382 = c16611.f53315;
        if (interfaceC0382 != null) {
            int i = c16611.f53313;
            interfaceC0382.mo2118(i, (C14459) list.get(i));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m39068(int i) {
        this.f53309.setText(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39067(InterfaceC0382 interfaceC0382) {
        this.f53315 = interfaceC0382;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39066(int i) {
        this.f53313 = i;
        this.f53311.setSelection(i);
        this.f53310.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39065() {
        this.f53312.m44362();
        LinkedList linkedList = new LinkedList();
        for (C20139 c20139 : this.f53308) {
            if (c20139.f65377) {
                linkedList.add(c20139);
            }
        }
        ExecutorService executorService = C4716.f16636;
        executorService.execute(new Runnable() { // from class: l.᩵ۨ֨
            @Override // java.lang.Runnable
            public final void run() {
                C16611.m39056(this.f62591);
            }
        });
        executorService.execute(new RunnableC19206(1, this, linkedList));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39056(C16611 c16611) {
        Iterator it = c16611.f53308.iterator();
        while (it.hasNext()) {
            ((C20139) it.next()).f65379.m34862();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39058(C16611 c16611, LinkedList linkedList) {
        final C20139 c20139;
        while (c16611.f53312.m44375()) {
            while (!c16611.f53307.isEmpty()) {
                int iMax = Math.max(1, (c16611.f53311.getLastVisiblePosition() - c16611.f53311.getFirstVisiblePosition()) + 1);
                synchronized (c16611.f53307) {
                    while (c16611.f53307.size() > iMax) {
                        c16611.f53307.removeFirst();
                    }
                    c20139 = (C20139) c16611.f53307.removeLast();
                }
                if (c20139.f65377) {
                    c20139.f65377 = false;
                    final BitmapDrawable bitmapDrawableM51895 = RunnableC23541.m51895(c20139.f65379.f47426);
                    C16737.m39273(new Runnable() { // from class: l.ܺۨ֨
                        @Override // java.lang.Runnable
                        public final void run() {
                            C20139 c201310 = c20139;
                            C19122 c19122 = c201310.f65378;
                            boolean z = c201310.f65375;
                            BitmapDrawable bitmapDrawable = bitmapDrawableM51895;
                            if (!z) {
                                c19122.setDrawable(bitmapDrawable);
                                return;
                            }
                            Drawable drawable = c19122.getDrawable();
                            bitmapDrawable.setBounds(drawable.getBounds());
                            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, bitmapDrawable});
                            c19122.setDrawable(transitionDrawable);
                            transitionDrawable.setCrossFadeEnabled(true);
                            transitionDrawable.startTransition(300);
                        }
                    });
                }
                while (c16611.f53312.m44375() && c16611.f53311.m17934()) {
                    SystemClock.sleep(100L);
                }
                if (!c16611.f53312.m44375()) {
                    return;
                }
            }
            while (!linkedList.isEmpty()) {
                if (c16611.f53307.isEmpty()) {
                    final C20139 c201310 = (C20139) linkedList.removeFirst();
                    if (c201310.f65377) {
                        c201310.f65377 = false;
                        final BitmapDrawable bitmapDrawableM51896 = RunnableC23541.m51895(c201310.f65379.f47426);
                        C16737.m39273(new Runnable() { // from class: l.ܺۨ֨
                            @Override // java.lang.Runnable
                            public final void run() {
                                C20139 c201311 = c201310;
                                C19122 c19122 = c201311.f65378;
                                boolean z = c201311.f65375;
                                BitmapDrawable bitmapDrawable = bitmapDrawableM51896;
                                if (!z) {
                                    c19122.setDrawable(bitmapDrawable);
                                    return;
                                }
                                Drawable drawable = c19122.getDrawable();
                                bitmapDrawable.setBounds(drawable.getBounds());
                                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, bitmapDrawable});
                                c19122.setDrawable(transitionDrawable);
                                transitionDrawable.setCrossFadeEnabled(true);
                                transitionDrawable.startTransition(300);
                            }
                        });
                    }
                    while (c16611.f53312.m44375() && c16611.f53311.m17934()) {
                        SystemClock.sleep(100L);
                    }
                    if (!c16611.f53312.m44375()) {
                        return;
                    }
                }
            }
            return;
        }
    }
}
