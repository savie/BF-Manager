.class public final synthetic Ll/ۙ᩵۫;
.super Ljava/lang/Object;
.source "D9TI"

# interfaces
.implements Ll/᩶ۚܺ;


# instance fields
.field public final synthetic ֡:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic ܰ:Ll/᩸᩵۫;

.field public final synthetic ܿ:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic ᩶:Ll/ۖۗܳ;


# direct methods
.method public synthetic constructor <init>(Ll/᩸᩵۫;Ll/ۖۗܳ;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙ᩵۫;->ܰ:Ll/᩸᩵۫;

    iput-object p2, p0, Ll/ۙ᩵۫;->᩶:Ll/ۖۗܳ;

    iput-object p3, p0, Ll/ۙ᩵۫;->ܿ:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p4, p0, Ll/ۙ᩵۫;->֡:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final ᩷()Landroid/graphics/Bitmap;
    .locals 4

    .line 0
    iget-object v0, p0, Ll/ۙ᩵۫;->ܿ:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v1, p0, Ll/ۙ᩵۫;->֡:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v2, p0, Ll/ۙ᩵۫;->ܰ:Ll/᩸᩵۫;

    iget-object v3, p0, Ll/ۙ᩵۫;->᩶:Ll/ۖۗܳ;

    invoke-static {v2, v3, v0, v1}, Ll/᩸᩵۫;->ۙ(Ll/᩸᩵۫;Ll/ۖۗܳ;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
