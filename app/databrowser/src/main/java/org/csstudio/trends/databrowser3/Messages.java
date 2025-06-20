/** *****************************************************************************
 * Copyright (c) 2010 Oak Ridge National Laboratory.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ***************************************************************************** */
package org.csstudio.trends.databrowser3;

import org.phoebus.framework.nls.NLS;

/**
 * String externalization
 *
 * @author Kay Kasemir
 */
public class Messages {

    // ---
    // --- Keep alphabetically sorted and 'in sync' with messages.properties!
    // ---
    /**
     * Externalized strings
     */
    public static String AddAxis,
            AddFormula,
            AddFormulaMsg,
            AddFormula_NameTT,
            AddItemErrorFmt,
            AddPV,
            AddPVs,
            AddPVsFromTheClipboard,
            AddPV_Axis,
            AddPV_AxisTT,
            AddPVMsg,
            AddPV_NameTT,
            AddPV_NewOrEmptyAxis,
            AddPV_OnChange,
            AddPV_OnChangeTT,
            AddPV_Period,
            AddPV_PeriodTT,
            AppendSearchResults,
            AppendSearchResultsTT,
            ArchiveFetchDetailFmt,
            ArchiveFetchJobFmt,
            ArchiveFetchProgressFmt,
            ArchiveFetchStart,
            ArchiveListGUI_NoArchives,
            ArchiveName,
            ArchiveRescale_Label,
            ArchiveRescale_NONE,
            ArchiveRescale_STAGGER,
            ArchiveServerErrorFmt,
            ArchiveServerInfo,
            ArchiveServerInfoHdr,
            AutoScale,
            Axis,
            AxisMax,
            AxisMin,
            AxisOnRight,
            AxisTT,
            AxisVisibility,
            BackgroundColorLbl,
            ChangeLiveCapacityCommandErrorFmt,
            ChangeNameErrorFmt,
            Color,
            ColorTT,
            CursorValue,
            CursorValueTT,
            DataBrowser,
            DataBrowserMenuPath,
            DefaultDisplayName,
            DeleteAxis,
            DeleteAxisWarningFmt,
            DeleteItem,
            DuplicateItemFmt,
            EditItems,
            EmptyNameError,
            EndTimeLbl,
            EndTimeTT,
            Error,
            Export,
            ExportBrowse,
            ExportBrowseTT,
            ExportDefaultDigits,
            ExportDefaultFilename,
            ExportDefaultLinearInterpolation,
            ExportDefaultLinearInterpolationTT,
            ExportDefaultOptimization,
            Export_Delimiter,
            ExportDigits,
            ExportDigitsError,
            ExportDigitsTT,
            ExportEnterFilenameError,
            ExportFileExists,
            ExportFileExistsFmt,
            ExportFilename,
            ExportFilenameTT,
            ExportFormat_DecimalTT,
            ExportFormat_DefaultTT,
            ExportFormat_ExponentialTT,
            ExportGroupFormat,
            ExportGroupOutput,
            ExportGroupSource,
            ExportLinearIntervalError,
            ExportMatlabFilenameError,
            ExportMinMaxCol,
            ExportMinMaxColTT,
            Export_NoValueMarker,
            ExportOptimizationTT,
            ExportOptimizeCountError,
            ExportPlotStartEnd,
            ExportPlotStartEndTT,
            ExportSource_Linear,
            ExportSource_LinearTT,
            ExportSource_OptimizedArchive,
            ExportSource_OptimizedArchiveTT,
            ExportSource_Plot,
            ExportSource_PlotTT,
            ExportSource_RawArchive,
            ExportSource_RawArchiveTT,
            ExportStartExport,
            ExportTabular,
            ExportTabularTT,
            ExportTypeMatlab,
            ExportTypeMatlabTT,
            ExportTypeSpreadsheet,
            ExportTypeSpreadsheetTT,
            ExportValueInfo,
            ExportValueInfoTT,
            FileFilterDesc,
            FileLoadErr,
            FileLoadJobName,
            FileOpenErr,
            FileTypeAll,
            FileTypePlot,
            FontBtnBold,
            FontBtnExample,
            FontBtnItalics,
            FontBtnJobName,
            FontBtnName,
            FontBtnSize,
            FontBtnStyle,
            FontTT,
            ForegroundColorLbl,
            Format_Decimal,
            Format_Default,
            Format_Exponential,
            Formula,
            FormulaCalcPane,
            FormulaCalcs0TT,
            FormulaCalcs1TT,
            FormulaCalcs2TT,
            FormulaCalcs3TT,
            FormulaCalcs4TT,
            FormulaCalcs5TT,
            FormulaCalcs6TT,
            FormulaCalcs7TT,
            FormulaCalcs8TT,
            FormulaCalcs9TT,
            FormulaCalcsAddTT,
            FormulaCalcsBsTT,
            FormulaCalcsCbTT,
            FormulaCalcsCfTT,
            FormulaCalcsDivTT,
            FormulaCalcsDotTT,
            FormulaCalcsMulTT,
            FormulaCalcsObTT,
            FormulaCalcsSubTT,
            FormulaEmpty,
            FormulaFuncPane,
            FormulaFunctAbsTT,
            FormulaFunctAcosTT,
            FormulaFunctAsinTT,
            FormulaFunctAtan2TT,
            FormulaFunctAtanTT,
            FormulaFunctCeilTT,
            FormulaFunctCosTT,
            FormulaFunctETT,
            FormulaFunctExpTT,
            FormulaFunctFloorTT,
            FormulaFunctIfTT,
            FormulaFunctLog10TT,
            FormulaFunctLogTT,
            FormulaFunctMaxTT,
            FormulaFunctMinTT,
            FormulaFunctPiTT,
            FormulaFunctPowTT,
            FormulaFunctSinTT,
            FormulaFunctSqrtTT,
            FormulaFunctTanTT,
            FormulaLabel,
            FormulaLabelEditTT,
            FormulaParsed,
            FormulaTabInput,
            FormulaTabVariable,
            FormulaTabTT,
            Grid,
            GridLbl,
            HideAll,
            HideTraceWarning,
            HideTraceWarningDetail,
            ImportActionLabelFmt,
            ImportTitle,
            Information,
            InspectSamples,
            InvalidScanPeriodError,
            ItemName,
            ItemNameTT,
            LabelFontLbl,
            LegendLbl,
            LegendFontLbl,
            LiveBufferSizeInfoFmt,
            LiveData,
            LiveSampleBufferSize,
            LogScale,
            Miscellaneous,
            Model_Disconnected,
            MoveAxisToTheLeft,
            MoveAxisToTheRight,
            MoveItemDown,
            MoveItemUp,
            Name,
            NegErrColumn,
            NewPlot,
            NewPlotFailed,
            NewPlotSelectionEmpty,
            NewPlotTargetFolderWriteProtected,
            NewPlotFileCreateFailed,
            NewPlotOverwriteExisting,
            NewPlotOverwriteExistingTitle,
            NoEachPVIsAssignedAnValueAxisIndividually,
            NoPVsFoundInTheClipboard,
            NotApplicable,
            OpenExportView,
            OpenPropertiesView,
            OpenSearchView,
            OpenWaveformView,
            OpenWaveformOverlapView,
            Plot_TimeAxisName,
            Plot_ValueAxisName,
            Plot_ValueAxisNameFMT,
            PointSize,
            PointSizeTT,
            PointType,
            PointTypeTT,
            PosErrColumn,
            PropertiesTabName,
            PVName,
            PVUsedInFormulaFmt,
            Refresh,
            RemoveEmptyAxes,
            ReplaceSearchResults,
            ReplaceSearchResultsTT,
            Request_optimized,
            Request_raw,
            RequestType,
            RequestTypeTT,
            RequestTypeWarning,
            RequestTypeWarningDetail,
            SampleView_Count,
            SampleView_Item,
            SampleView_Refresh,
            SampleView_RefreshTT,
            SampleView_SelectItem,
            SampleView_Source,
            Save,
            SaveChangesLbl,
            SaveChangesTT,
            ScaleFontLbl,
            ScanPeriod,
            ScanPeriodChangeErrorFmt,
            ScanPeriodTT,
            ScrollStepLbl,
            Search,
            SearchChannelFmt,
            SearchPattern,
            SearchPatternTT,
            SearchTT,
            SelectTrace,
            SeverityColumn,
            SeverityStatusFmt,
            ShowAll,
            SmoothView,
            StartEndDialogBtn,
            StartEndDialogTT,
            StartTimeLbl,
            StartTimeTT,
            StatisticsTab,
            StatisticsMean,
            StatisticsMedian,
            StatisticsStdDev,
            StatisticsMin,
            StatisticsMax,
            StatisticsSum,
            StatisticsSampleCount,
            StatusColumn,
            TheClipboardDoesNotContainPVs,
            TimeAxis,
            TimeColumn,
            TitleFontLbl,
            TitleLbl,
            TitleTT,
            TraceDisplayName,
            TraceDisplayNameTT,
            TraceLineStyle,
            TraceLineStyleTT,
            TraceLineWidth,
            TraceLineWidthTT,
            TracesTab,
            TraceTableEmpty,
            TraceType,
            TraceTypeTT,
            TraceVisibility,
            TraceVisibilityTT,
            UpdatePeriodLbl,
            URL,
            UseAxisName,
            UseInterpolate,
            UseJet,
            UseLines,
            UsePoints,
            UseTheSameValueAxisForAllAddedPVs,
            UseTraceNames,
            UseUnixTimeStamp,
            ValueAxes,
            ValueAxisName,
            ValueColumn,
            WaveformIndex,
            WaveformIndexCol,
            WaveformIndexColTT,
            WaveformStatus,
            WaveformTimeSelector,
            WaveformTimestamp,
            WaveformView,
            WaveformViewSelect,
            YesAllPVsAreAddedToTheAxis;
    // ---
    // --- Keep alphabetically sorted and 'in sync' with messages.properties!
    // ---

    static {
        NLS.initializeMessages(Messages.class);
    }

    private Messages() {
        // Prevent instantiation
    }
}
