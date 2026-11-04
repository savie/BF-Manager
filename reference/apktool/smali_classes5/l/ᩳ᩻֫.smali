.class public final synthetic Ll/ᩳ᩻֫;
.super Ljava/lang/Object;
.source "66IQ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:I

.field public final synthetic ۟:J

.field public final synthetic ܰ:Ll/ۡ᩻֫;

.field public final synthetic ܿ:Ll/۬ۚ֫;

.field public final synthetic ᩶:J


# direct methods
.method public synthetic constructor <init>(Ll/ۡ᩻֫;JLl/۬ۚ֫;IJ)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳ᩻֫;->ܰ:Ll/ۡ᩻֫;

    iput-wide p2, p0, Ll/ᩳ᩻֫;->᩶:J

    iput-object p4, p0, Ll/ᩳ᩻֫;->ܿ:Ll/۬ۚ֫;

    iput p5, p0, Ll/ᩳ᩻֫;->֡:I

    iput-wide p6, p0, Ll/ᩳ᩻֫;->۟:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 0
    iget v4, p0, Ll/ᩳ᩻֫;->֡:I

    iget-wide v5, p0, Ll/ᩳ᩻֫;->۟:J

    iget-object v0, p0, Ll/ᩳ᩻֫;->ܰ:Ll/ۡ᩻֫;

    iget-wide v1, p0, Ll/ᩳ᩻֫;->᩶:J

    iget-object v3, p0, Ll/ᩳ᩻֫;->ܿ:Ll/۬ۚ֫;

    invoke-static/range {v0 .. v6}, Ll/ۡ᩻֫;->ۙ(Ll/ۡ᩻֫;JLl/۬ۚ֫;IJ)V

    return-void
.end method
