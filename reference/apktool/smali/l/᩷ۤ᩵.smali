.class public abstract Ll/᩷ۤ᩵;
.super Ll/ۧ᩸ۨ;
.source "0IX0"


# instance fields
.field public final ᩷:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(Ll/֨ۤ᩵;)V
    .locals 1

    const/4 v0, 0x2

    .line 6
    invoke-direct {p0, v0}, Ll/ۧ᩸ۨ;-><init>(I)V

    .line 18
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/᩷ۤ᩵;->᩷:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final ۙ()Ll/֨ۤ᩵;
    .locals 1

    .line 32
    iget-object v0, p0, Ll/᩷ۤ᩵;->᩷:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨ۤ᩵;

    return-object v0
.end method

.method public final ۤ()V
    .locals 0

    .line 28
    invoke-virtual {p0}, Ll/᩷ۤ᩵;->᩷()V

    return-void
.end method

.method public abstract ᩷()V
.end method
