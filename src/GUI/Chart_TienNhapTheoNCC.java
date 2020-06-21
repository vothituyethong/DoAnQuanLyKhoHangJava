package GUI;

import BLL.PNhapBLL;
import DTO.PNhapDTO;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author 
 */
public class Chart_TienNhapTheoNCC extends JFrame{

    static ArrayList<PNhapDTO> arr = new ArrayList<PNhapDTO>();
    
    Chart_TienNhapTheoNCC(){
        ChartPanel chartPanel = new ChartPanel(createChart());
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        chartPanel.setBackground(Color.PINK);
        JFrame frame = new JFrame();
        frame.add(chartPanel);        
        frame.setSize(1280,595);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    public static JFreeChart createChart() {
        JFreeChart barChart = ChartFactory.createBarChart(
                "THỐNG KÊ SỐ TIỀN NHẬP HÀNG THEO NHÀ CUNG CẤP",
                "Mã Nhà cung cấp", "Số tiền",
                createDataset(), PlotOrientation.VERTICAL, false, false, false);
        return barChart;
    }

    private static CategoryDataset createDataset() {
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
	PNhapBLL pnBLL = new PNhapBLL();
	arr = pnBLL.TK_TienTheoNCC();
        PNhapDTO pnDTO = new PNhapDTO();
	for (int i = 0; i < arr.size(); i++) {
            pnDTO = arr.get(i);
            String NccId=pnDTO.getMA_NCC();            
            int tien=pnDTO.getTONG_TIEN();
            dataset.addValue(tien,"Số tiền",NccId);
	}        
        return dataset;
    }

    

}