.class public final synthetic Ll/ۧ֫ܳ;
.super Ljava/lang/Object;
.source "R6JU"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Ll/᩻֫ܳ;


# direct methods
.method public synthetic constructor <init>(Ll/᩻֫ܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧ֫ܳ;->ܰ:Ll/᩻֫ܳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 2
    iget-object v1, p0, Ll/ۧ֫ܳ;->ܰ:Ll/᩻֫ܳ;

    .line 622
    iget-object v0, v1, Ll/᩻֫ܳ;->᩵:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 623
    iget-object v0, v1, Ll/᩻֫ܳ;->۟:Ll/ܽ֫ܳ;

    iget-object v2, v1, Ll/᩻֫ܳ;->ۛ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    iget-wide v4, v1, Ll/᩻֫ܳ;->᩶:J

    iget-wide v6, v1, Ll/᩻֫ܳ;->ۤ:J

    invoke-static/range {v0 .. v7}, Ll/ܽ֫ܳ;->ۙ(Ll/ܽ֫ܳ;Ll/᩻֫ܳ;JJJ)V

    return-void
.end method
